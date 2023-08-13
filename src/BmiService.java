public class BmiService {
    public int calculate(int weight) {
        double height = 1.87;
        int bmi = (int) (weight / (height * height));
        return bmi;
    }
}

