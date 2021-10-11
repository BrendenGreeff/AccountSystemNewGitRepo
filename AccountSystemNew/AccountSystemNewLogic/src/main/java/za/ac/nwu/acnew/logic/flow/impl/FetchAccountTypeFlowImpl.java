package za.ac.nwu.acnew.logic.flow.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.acnew.domain.persistence.AccountType;
import za.ac.nwu.acnew.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.acnew.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow{

    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public List<AccountType> getAllAccountTypes(){
        List<AccountType> accountTypeTranslator = new ArrayList<>();
        accountTypeTranslator.add(new AccountType("Miles", LocalDate.now()));
        return accountTypeTranslator;
    }

    /*@Override
    public List<AccountType> getAllAccountTypes() {
        return accountTypeTranslator.getAllAccountTypes();
    }

   @Override
    public List<AccountType> getAllAccountTypes(){
        List<AccountType> accountTypes = new ArrayList<>();
        accountTypes.add(new AccountType("Miles", LocalDate.now()));
        return accountTypes;
    }*/

    public boolean methodToTest(){
       return true;
    }


}
