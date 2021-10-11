package za.ac.nwu.acnew.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.acnew.domain.persistence.AccountType;
import za.ac.nwu.acnew.translator.AccountTypeTranslator;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    @Mock
    private AccountTypeTranslator translator;

    @InjectMocks
    private CreateAccountTypeFlowImpl flow;

    @Before
    public void setUp() throws Exception {
        //translator = Mockito.mock(AccountTypeTranslator.class); "These 2 lines are to mock the hard way
        //flow =  new CreateAccountTypeFlowImpl(translator);        otherwise just look at the private method and how its mocked with @Mock & @InjectMock"
    }
    @After
    public void tearDown() throws Exception {
        // What happens after each test
    }
    @Test
    public void test() {
        when(translator.create(any(AccountType.class))).thenReturn(null);
        AccountType result = flow.create(new AccountType());
        assertNull(result);

    }

}