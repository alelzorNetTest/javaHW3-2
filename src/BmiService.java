public class BmiService {
    public int calculate(double highM, double weightKg) {
        double index = weightKg / (highM*highM);
        int indexBmi = (int) index;
        return indexBmi;
    }
}
