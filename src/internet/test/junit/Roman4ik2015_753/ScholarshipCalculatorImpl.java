package internet.test.junit.Roman4ik2015_753;

interface IscholarshipCalculator {
    public double scholarshipCalculate(double stepUpCoefficient);
}

public class  ScholarshipCalculatorImpl implements IscholarshipCalculator {
    public static final double BASIC_SCHOLARSHIP = 100;
    @Override
    public double scholarshipCalculate(double stepUpCoefficient) {
        return BASIC_SCHOLARSHIP * stepUpCoefficient;
    }

    public static void main(String[] args) {
        ScholarshipCalculatorImpl scholarshipCalculator = new ScholarshipCalculatorImpl();
        System.out.println("scholarshipCalculator.scholarshipCalculate(0.3) = " + scholarshipCalculator.scholarshipCalculate(0.3));
    }
}
