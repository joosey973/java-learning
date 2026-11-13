package FifthPractice.bank;

public class CreditAccount extends Account {
    public CreditAccount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма кредита не может быть неположительной");
        }

        super(-amount);
    }

    @Override
    public void payAmount(double amount) {
        if (amount < 0) {
            System.out.println("Сумма платежа не может быть отрицательной");
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

        this.balance -= amount;
        account.balance += amount;
        System.out.printf("Перевод денег с кредитного счета на %s на сумму %.2f%n", account.getAccountName(), amount);
    }

    @Override
    public void addMoney(double amount) {
        if (this.balance + amount > 0) {
            System.out.println("Невозможно пополнить. Сумма кредитного счета не может быть больше 0.");
            return;
        }

        this.balance += amount;
        System.out.println("Совершено полнение денег на кредитный счет на сумму " + amount);
    }
}
