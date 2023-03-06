public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int WeightInKg = 73;
        double HeightInMeters = 1.86;
        double Bmi = service.calculate(WeightInKg, HeightInMeters);
        System.out.println("Ваш индекс массы тела = " + Bmi);
    }
}