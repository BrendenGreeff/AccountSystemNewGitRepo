package za.ac.nwu.acnew.domain.dto;

import za.ac.nwu.acnew.domain.persistence.AccountType;
import java.time.LocalDate;
import java.util.Objects;


public class AccountTypeDto {

    private Integer id;
    private String accountType;
    private LocalDate accountCreationDate;

    public AccountTypeDto() {
    }

    public AccountTypeDto(Integer id, String accountType, LocalDate accountCreationDate) {
        this.id = id;
        this.accountType = accountType;
        this.accountCreationDate = accountCreationDate;
    }

    public AccountTypeDto(AccountType accountType) {
        this.setAccountType(accountType.getAccountType());
        this.setAccountCreationDate(accountType.getAccountCreationDate());
    }

    public Integer getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

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
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(id, that.id) && Objects.equals(accountType, that.accountType) && Objects.equals(accountCreationDate, that.accountCreationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountType, accountCreationDate);
    }

    @Override
    public String toString() {
        return "AccountTypeDto{" +
                "id=" + id +
                ", accountType='" + accountType + '\'' +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }
}
