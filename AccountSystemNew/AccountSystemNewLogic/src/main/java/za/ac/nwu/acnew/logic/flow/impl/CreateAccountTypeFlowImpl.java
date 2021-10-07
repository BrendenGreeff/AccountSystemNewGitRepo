package za.ac.nwu.acnew.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.acnew.domain.persistence.AccountType;
import za.ac.nwu.acnew.logic.CreateAccountTypeFlow;
import za.ac.nwu.acnew.translator.AccountTypeTranslator;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component //("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;

    public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator) {
        this.accountTypeTranslator = accountTypeTranslator;
    }
    @Override
    public AccountType create(AccountType accountType){
        if(null == accountType.getAccountCreationDate()){
            accountType.setAccountCreationDate(LocalDate.now());
        }
        return accountTypeTranslator.create(accountType);
    }
}
