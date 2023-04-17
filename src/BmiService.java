public class BmiService {
    public int calculate(int weightInKg, double heightInMeters) {
        int Bmi = (int) (weightInKg / (heightInMeters * heightInMeters));
        return Bmi;
    }
}
