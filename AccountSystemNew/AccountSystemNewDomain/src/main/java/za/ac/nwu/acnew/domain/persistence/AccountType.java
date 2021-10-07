package za.ac.nwu.acnew.domain.persistence;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@ApiModel(value = "AccountType", description = "Represents the account type")
@Table(name = "account_types")
@Entity
public class AccountType {

    private Integer id;
    private String accountType;
    private LocalDate accountCreationDate;

    private Set<AccountTransaction> accountTransactions;

    public AccountType() {
    }

    public AccountType(String accountType, LocalDate accountCreationDate) {
        this.accountType = accountType;
        this.accountCreationDate = accountCreationDate;
    }

    public AccountType(AccountType accountType) {
        this.setId(accountType.getId());
        this.setAccountType(accountType.getAccountType());
        this.setAccountCreationDate(accountType.getAccountCreationDate());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Account_Types_ID", nullable = false)
    @ApiModelProperty(position = 1,
            value = "Account Type ID",
            name =  "ID",
            notes = "Uniquely identifies the account type",
            dataType = "java.lang.String",
            example = "1",
            required = true
    )
    public Integer getId() {

        return id;
    }

    @Column(name = "Account_Type", nullable = false, length = 45)
    @ApiModelProperty(position = 2,
            value = "Account Type Name",
            name =  "Name",
            notes = "Identifies the account type",
            dataType = "java.lang.String",
            example = "Miles",
            required = true
    )
    public String getAccountType() {

        return accountType;
    }

    @Column(name = "Account_Creation_Date", nullable = false)
    @ApiModelProperty(position = 3,
            value = "AccountType Creation Date",
            name =  "accountCreationDate",
            notes = "Date on which account type was created",
            dataType = "java.lang.String",
            example = "2021-02-01",
            allowEmptyValue = true
    )
    public LocalDate getAccountCreationDate() {

        return accountCreationDate;
    }

    @OneToMany //(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "accountType", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<AccountTransaction> getAccountTransaction(){

        return accountTransactions;
    }

    public void setAccountTransaction(Set<AccountTransaction> accountTransactions){
        this.accountTransactions = accountTransactions;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public void setAccountType(String accountType) {

        this.accountType = accountType;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(id, that.id) && Objects.equals(accountType, that.accountType) && Objects.equals(accountCreationDate, that.accountCreationDate);
    }

    /* @JsonIgnore
    public AccountType getAccountType(){
        return new AccountType(getId(), getAccountType(), getAccountCreationDate());
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id, accountType, accountCreationDate);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "id=" + id +
                ", accountType='" + accountType + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }
}