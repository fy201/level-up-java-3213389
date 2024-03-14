package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(App.isEven(0) );
        assertTrue(App.isEven(2));
        assertTrue(App.isEven(40));
    }
    
    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(App.isEven(1));
        assertFalse(App.isEven(15));
        assertFalse(App.isEven(-31));
    }
}
