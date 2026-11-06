package FirstPractice.methods;

public class MathMethods {
    public static double pow(double n, int stepen) {
        double total = 1;
        for (int i = 0; i < stepen; i++) {
            total *= n;
        }
        return total;
    }

    public static double abs(double n) {
        return n > 0 ? n : -n;
    }
}
