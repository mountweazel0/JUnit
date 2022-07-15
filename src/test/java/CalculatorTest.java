import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroShouldThrowArithmeticException() {
        calculator.divide(20, 0);
    }


    @Test(timeout = 1000)
    public void testTimeOfOperationsShouldBeLessThan1000ms() {
        calculator.subtraction(10.098, -3657);
    }


    @Test
    public void testMultiply() {
        double testMultiplyResult = calculator.multiply(42.00, 1);
        double expectedMultiplyResult = 42;

        Assert.assertEquals(testMultiplyResult, expectedMultiplyResult, 1e-5);
    }

}
