package za.ac.nwu.acnew.logic;

import za.ac.nwu.acnew.domain.persistence.AccountType;

public interface CreateAccountTypeFlow {
    AccountType create(AccountType accountType);
}
