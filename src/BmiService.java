public class BmiService {
    public int calculate(int WeightInKg, double HeightInMeters) {
        int Bmi = (int) (WeightInKg / (HeightInMeters * HeightInMeters));
        return Bmi;
    }
}
