package za.ac.nwu.acnew.translator;

import za.ac.nwu.acnew.domain.persistence.AccountType;
import java.util.List;

public interface AccountTypeTranslator {
    List<AccountType> getAllAccountTypes();
    AccountType create(AccountType accountType);
}
