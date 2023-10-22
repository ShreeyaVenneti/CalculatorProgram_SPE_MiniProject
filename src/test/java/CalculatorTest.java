import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.beans.Transient;
import java.util.*;

public class CalculatorTest
{
    Calculator c = new Calculator();

    @Test
    public void testAddition()
    {
        double observed1 = c.addition(12.9, 12.9);
        double expected1 = 25.8;
        Assert.assertEquals(observed1, expected1, 1e-10);
    }

    @Test
    public void testMultiplication()
    {
        double observed2 = c.division(12.9, 12.9);
        double expected2 = 1.0;
        Assert.assertEquals(observed2, expected2, 1e-10);
    }
}