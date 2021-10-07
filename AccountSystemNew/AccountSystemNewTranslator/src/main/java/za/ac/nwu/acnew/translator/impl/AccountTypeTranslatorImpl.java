package za.ac.nwu.acnew.translator.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.acnew.domain.persistence.AccountType;
import za.ac.nwu.acnew.repo.persistence.AccountTypeRepository;
import za.ac.nwu.acnew.translator.AccountTypeTranslator;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTypeTranslatorImpl implements AccountTypeTranslator {

    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountType> getAllAccountTypes() {
        List<AccountType> accountTypes =  new ArrayList<>();

        try {
            for(AccountType accountType : accountTypeRepository.findAll()){
                accountTypes.add(new AccountType(accountType));
            }

        } catch(Exception e){
            throw new RuntimeException("Unable to read from the DB", e);
        }
        return accountTypes;
    }

    @Override
    public AccountType create(AccountType accountType) {
        try{
            AccountType accountTypes = accountTypeRepository.save(accountType);
            return new AccountType(accountType);
        } catch (Exception e){
            throw new RuntimeException("Unable to save to the DB", e);
        }
    }
}
