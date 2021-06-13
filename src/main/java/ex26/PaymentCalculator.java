package ex26;

import static java.lang.Math.*;

public class PaymentCalculator {
    public static int calculatorMonthsUntilPaidOff(double b, double i, double p) {
        int calc = (int)ceil(-(1.0/30.0) * log(1 + b/p * (1 - pow((1 + i),30))) / log(1 + i));
        return calc;
    }
}
