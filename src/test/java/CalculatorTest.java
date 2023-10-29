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

    @Test
    public void testLogarithm()
    {
        double observed3 = c.logarithm(9, 3);
        double expected3 = 2.0;
        Assert.assertEquals(observed3, expected3, 1e-10);
    }

    @Test
    public void testLogarithm2()
    {
        double observed4 = c.logarithm(1, 2);
        double expected4 = 0.0;
        Assert.assertEquals(observed4, expected4, 1e-10);
    }

    @Test
    public void testLogarithm3()
    {
        double observed5 = c.logarithm(0, 2);
        double expected5 = Double.NaN;
        Assert.assertEquals(observed5, expected5, 1e-10);
    }

    @Test
    public void testSquareRoot1()
    {
        double observed6 = c.square_root(100);
        double expected6 = 10.0;
        Assert.assertEquals(observed6, expected6, 1e-10);
    }

    @Test
    public void testSquareRoot2()
    {
        double observed7 = c.square_root(-100);
        double expected7 = Double.NaN;
        Assert.assertEquals(observed7, expected7, 1e-10);
    }
}