package FifthPractice.bank;

abstract public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    abstract public void payAmount(double amount);
    abstract public void transfer(Account account, double amount);
    abstract public void addMoney(double amount);

    public String getAccountName() {
        return this.getClass().getSimpleName();
    }
    
    public double getBalance() {
        return this.balance;
    }
}
