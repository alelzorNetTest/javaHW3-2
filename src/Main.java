public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double highM = 1.87;
        double weightKg = 98.0;
        int indexBmi = service.calculate(highM, weightKg); // должно получиться 28
        System.out.println(indexBmi);
    }
}
