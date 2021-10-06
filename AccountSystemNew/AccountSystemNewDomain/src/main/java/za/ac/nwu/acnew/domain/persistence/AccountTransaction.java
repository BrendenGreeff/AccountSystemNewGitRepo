package za.ac.nwu.acnew.domain.persistence;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Table(name = "account_transactions", indexes = {
        @Index(name = "FK_Account_Type_ID_idx", columnList = "Account_Type_ID"),
        @Index(name = "FK_Member_ID_idx", columnList = "Member_ID")
})
@Entity
public class AccountTransaction{

    private Integer id;
    private Member member;
    private AccountType accountType;
    private Integer milesAmount;
    private LocalDate accountTransactionDate;

    public AccountTransaction() {
    }

    public AccountTransaction(Integer id, Member member, AccountType accountType, Integer milesAmount, LocalDate accountTransactionDate) {
        this.id = id;
        this.member = member;
        this.accountType = accountType;
        this.milesAmount = milesAmount;
        this.accountTransactionDate = accountTransactionDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Account_Transactions_ID", nullable = false)
    public Integer getId() {

        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Member_ID")
    public Member getMember() {

        return member;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Account_Type_ID")
    public AccountType getAccountType() {

        return accountType;
    }

    @Column(name = "Miles_Amount", nullable = false)
    public Integer getMilesAmount() {

        return milesAmount;
    }

    @Column(name = "Account_Transaction_Date", nullable = false)
    public LocalDate getAccountTransactionDate() {

        return accountTransactionDate;
    }

    public void setAccountTransactionDate(LocalDate accountTransactionDate) {
        this.accountTransactionDate = accountTransactionDate;
    }

    public void setMilesAmount(Integer milesAmount) {

        this.milesAmount = milesAmount;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setMember(Member member) {

        this.member = member;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(id, that.id) && Objects.equals(member, that.member) && Objects.equals(accountType, that.accountType) && Objects.equals(milesAmount, that.milesAmount) && Objects.equals(accountTransactionDate, that.accountTransactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, member, accountType, milesAmount, accountTransactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "id=" + id +
                ", member=" + member +
                ", accountType=" + accountType +
                ", milesAmount=" + milesAmount +
                ", accountTransactionDate=" + accountTransactionDate +
                '}';
    }
}