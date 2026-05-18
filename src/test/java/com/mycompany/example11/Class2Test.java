package com.mycompany.example11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Class2Test {
    
    public Class2Test() {
    }

    @Test
    public void testAdd() 
    {
        Class2 bb = new Class2();
        int expected = 3;
        int actual = bb.add(1, 2);
        
        assertEquals(expected, actual);
    }
    
}
