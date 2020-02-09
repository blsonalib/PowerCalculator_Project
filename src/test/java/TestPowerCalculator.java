import org.junit.Assert;
import org.junit.Test;

public class TestPowerCalculator {
    @Test
    public void givenNumber_WhenGivesTwoNumber_ThenShouldReturnPowerOfNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.powerOfNumber(2, 3);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void givenNumber_WhenPowerIsZero_ThenShouldReturnOne() {
        Calculator calculator = new Calculator();
        int result = calculator.powerOfNumber(2, 0);
        Assert.assertEquals(result, 1);

    }

    @Test
    public void givenNumber_WhenNumberIsNegative_ThenShouldReturnPowerNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.powerOfNumber(-2, 2);
        Assert.assertEquals(result, 4);
    }
}