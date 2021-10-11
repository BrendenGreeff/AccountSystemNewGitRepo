package za.ac.nwu.acnew.logic.flow.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuloTest {

    private Modulo mod;

    @Before
    public void setUp() throws Exception{
        mod = new Modulo();
    }

    @Test
    public void testMethod(){
        Integer result = mod.doMod(9, 5);
        assertNotNull("Should not be null", result);
        assertEquals("Should be value 4", 4, result.intValue());

    }

    @Test
    public void testMethodBy0(){
        Integer result = mod.doMod(9, 0);
        assertNull("Should be null", result);

    }
}
