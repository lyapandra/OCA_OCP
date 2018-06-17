package internet.test.junit.Roman4ik2015_753;

import org.junit.Assert;
import org.junit.Test;

public class ScholarshipCalculatorTest {
    @Test
    public void scholarshipCalculateTest() {
        IscholarshipCalculator scholarshipCalculator =
                new ScholarshipCalculatorImpl();
        double basicScholarship = ScholarshipCalculatorImpl.BASIC_SCHOLARSHIP;
        double stepUpCoefficient = 1.1;
//        double expected = basicScholarship * stepUpCoefficient;
        double expected = 1.01 * basicScholarship * stepUpCoefficient;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
// проверка на совпадение с погрешностью 0,01
        double expVal = 10.001;
        double realVal = 10.000;
//        System.out.println("expected-realVal = " + (expected - realVal));
        Assert.assertEquals( "\nTest is passed:", expVal, realVal, 0.001);
//        Assert.assertEquals( "\nTest is failed:", expVal, realVal, 0.0009);
        Assert.assertEquals( "\nTest is failed:" + Math.abs(expVal - realVal) + ":", expVal, realVal, 0.0009);
//        Assert.assertEquals(expected, actual, 0.01);


 Assert.assertEquals( "\nTest is failed:", expected, actual, 1.1);
// устаревшие варианты :
// Assert.assertEquals(expected, actual); // на точное совпадение — deprecated
// Assert.assertEquals( "Тест не прошел, т.к.", expected, actual); // deprecated
    }
}
