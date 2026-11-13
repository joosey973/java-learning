package FifthPractice.bank;

public class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Сумма расчетного счета не может быть отрицательной");
        }
        super(balance);
    }

    @Override
    public void payAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода не может быть отрицательной!");
            return;
        }

        if (this.balance - amount < 0) {
            System.out.println("Ошибка перевода. Недостаточно средств на балансе!");
            return;
        }

        this.balance -= amount;
        System.out.println("Платеж успешно прошел!");
    }

    @Override
    public void transfer(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода не может быть отрицательной!");
            return;
        }
        if (this.balance - amount < 0) {
            System.out.println("Ошибка перевода. Недостаточно средств на расчетном счете для перевода!");
            return;
        }

        this.balance -= amount;
        account.balance += amount;
        System.out.printf("Перевод денег с расчетного счета на %s на сумму %.2f%n", this.getAccountName(), amount);
    }

    @Override
    public void addMoney(double amount) {
        this.balance += amount;
        System.out.println("Совершено полнение денег на расчетный счет на сумму " + amount);
    }    
}
