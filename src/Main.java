public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 73;  // Weight in kilograms.
        double height = 1.86;  // Height in meters.
        double Bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела = " + Bmi);
    }
}