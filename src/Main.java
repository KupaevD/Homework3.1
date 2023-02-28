public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double meters = 1.87;
        double kilograms = 98;
        double index = service.calculate(meters, kilograms);
        int bmi = (int) index;

        System.out.println("Индекс массы тела равен " + bmi);

    }
}