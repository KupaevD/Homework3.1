public class BmiService {

    public double calculate(double meters, double kilograms) {

        double bmi;
        bmi = kilograms / (meters * meters);

        return bmi;
    }
}