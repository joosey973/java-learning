package EighthPractice;

import EighthPractice.Calculator.Calculator;

public class Prog1 {
    public static void main(String[] args) {
        // Код не работал, тк происходило деление на ноль.
        // Я решил эту проблему так, что в теле лямба-выражения сделал проверку на ноль.
        // В случае, если y == 0, выбрасывается арифметическая ошибка
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b + 1);

        calc.println.accept(c);
        calc.println.accept(calc.abs.apply(-10));
        calc.println.accept(calc.abs.apply(5));
        calc.println.accept(calc.pow.apply(13));
        calc.println.accept(calc.isPositive.test(-123) ? 1 : 0);
    }
}
