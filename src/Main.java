public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 73;
        double heightInMeters = 1.86;
        double Bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println("Ваш индекс массы тела = " + Bmi);
    }
}