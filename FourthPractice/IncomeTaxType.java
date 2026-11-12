package FourthPractice;

public class IncomeTaxType extends TaxType {
    @Override
    public double claculateTaxFor(double amount) {
        return amount * 0.13;
    }
}
