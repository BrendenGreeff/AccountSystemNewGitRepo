package za.ac.nwu.acnew.domain.persistence;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "account_types")
@Entity
public class AccountType {

    private Integer id;
    private String accountType;
    private LocalDate accountCreationDate;

    public AccountType() {
    }

    public AccountType(Integer id, String accountType, LocalDate accountCreationDate) {
        this.id = id;
        this.accountType = accountType;
        this.accountCreationDate = accountCreationDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Account_Types_ID", nullable = false)
    public Integer getId() {

        return id;
    }

    @Column(name = "Account_Type", nullable = false, length = 45)
    public String getAccountType() {

        return accountType;
    }

    @Column(name = "Account_Creation_Date", nullable = false)
    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
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