package FourthPractice;

public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = this.taxType.claculateTaxFor(this.amount);

        taxService.payOut(taxAmount);
    }

    public static void main(String[] args) {
        int amount = 50_000;
        IncomeTaxType incomeTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progressiveTaxType = new ProgressiveTaxType();

        TaxService taxService = new TaxService();

        Bill bill1 = new Bill(amount, incomeTaxType, taxService);
        Bill bill2 = new Bill(amount, vaTaxType, taxService);
        Bill bill3 = new Bill(amount, progressiveTaxType, taxService);

        bill1.payTaxes();
        bill2.payTaxes();
        bill3.payTaxes();
    }

}
