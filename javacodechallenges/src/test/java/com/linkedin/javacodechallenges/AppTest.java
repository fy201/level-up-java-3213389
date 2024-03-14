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
        assertTrue(App.isPasswordComplex("Fatima23") );
        assertTrue(App.isPasswordComplex("Pa33word"));
        assertTrue(App.isPasswordComplex("jaVa13"));
    }
    
    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(App.isPasswordComplex("1234567"));
        assertFalse(App.isPasswordComplex("paowrd"));
        assertFalse(App.isPasswordComplex("AslamUmar"));
    }
}
