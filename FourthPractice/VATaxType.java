package FourthPractice;

public class VATaxType extends TaxType {
    @Override
    public double claculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
