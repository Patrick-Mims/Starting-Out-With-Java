package edu.sfsu;

<<<<<<< HEAD
import static org.junit.Assert.assertTrue;

import org.junit.Test;
=======
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
>>>>>>> 8620326 (initial add)

/**
 * Unit test for simple App.
 */
public class AppTest 
{
<<<<<<< HEAD
    /**
     * Rigorous Test :-)
     */
=======
>>>>>>> 8620326 (initial add)
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
<<<<<<< HEAD
=======

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, App.add(2,2));
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        assertEquals(8, App.subtract(6, 2));
    }
>>>>>>> 8620326 (initial add)
}
