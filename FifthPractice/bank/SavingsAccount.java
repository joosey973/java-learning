package FifthPractice.bank;

public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Сумма сберегательного счета не может быть отрицательной");
        }
        super(balance);
    }

    @Override
    public void payAmount(double amount) {
        System.out.println("Со сберегательного счета нельзя платить!");
    }

    @Override
    public void transfer(Account account, double amount) {
        if (amount <= 0) {
            System.out.println("Сумма перевода не может быть отрицательной!");
            return;
        }

        if (balance - amount < 0) {
            System.out.println("Нельзя совершить операцию. Недостаточно средств для перевода!");
            return;
        }
        this.balance -= amount;
        account.balance += amount;
        System.out.printf("Перевод денег со сберегательного счета на %s на сумму %.2f%n", this.getAccountName(), amount);
    }

    @Override
    public void addMoney(double amount) {
        if (amount < 0) {
            System.out.println("Нельзя пополнить сберегательный счет на отрицательную сумму!");
            return;
        }
        this.balance += amount;
        System.out.println("Совершено полнение денег на сберегательный счет на сумму " + amount);
    }
}
