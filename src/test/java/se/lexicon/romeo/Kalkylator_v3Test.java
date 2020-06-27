package se.lexicon.romeo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static se.lexicon.romeo.Kalkylatorv3.*;

public class Kalkylator_v3Test
{
    @Test
    public void TestSubtractionArray()
    {
        double[] inputArray = new double[]{-7,5,3};
        assertTrue(-15 == subtraction(inputArray));
    }
    @Test
    public void TestAdditionArray()
    {
        double[] inputArray = new double[]{-7,5,3};
        assertTrue(1 == addition(inputArray));
    }
    @Test
    public void TestSubtraction()
    {
        double firstNr = -7;
        double secondNr = 5;
        assertTrue(-12 == subtraction(firstNr, secondNr));
    }
    @Test
    public void TestAddition()
    {
        double firstNr = -7;
        double secondNr = 5;
        assertTrue(-2 == addition(firstNr, secondNr));
    }
    @Test
    public void TestMultiplication()
    {
        double firstNr = -7;
        double secondNr = 5;
        assertTrue(-35 == multiplication(firstNr, secondNr));
    }
    @Test
    public void TestMultiplicationArray()
    {
        double[] inputArray = new double[]{-7,5,3};
        assertTrue(-105 == multiplication(inputArray));
    }
    @Test
    public void TestDivision()
    {
        double firstNr = -7;
        double secondNr = 2;
        assertTrue(-3.5 == division(firstNr, secondNr));
    }
}