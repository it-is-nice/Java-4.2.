public class BmiService {
    public double calculate (int weight, double height) {
        height = height / 100;

        double bmi = weight / height /height;

    return bmi;
    }
}
