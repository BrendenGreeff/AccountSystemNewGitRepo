package za.ac.nwu.acnew.logic.flow;

import za.ac.nwu.acnew.domain.persistence.AccountType;
import java.util.List;

public interface FetchAccountTypeFlow{
    List<AccountType> getAllAccountTypes();
}
