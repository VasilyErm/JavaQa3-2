public class BmiService {
    public double calculate(int weight, double height) {
        int Bmi = (int) (weight / (height * height));
        return Bmi;
    }
}
