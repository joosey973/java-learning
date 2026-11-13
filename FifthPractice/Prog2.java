package FifthPractice;

import FifthPractice.bank.CheckingAccount;
import FifthPractice.bank.CreditAccount;
import FifthPractice.bank.SavingsAccount;

public class Prog2 {
    public static void main(String[] args) {
        SavingsAccount savingAcccount = new SavingsAccount(1000);
        CreditAccount creditAccount = new CreditAccount(500);
        CheckingAccount checkingAccount = new CheckingAccount(2000);
        
        savingAcccount.addMoney(500);
        savingAcccount.payAmount(100);
        savingAcccount.transfer(checkingAccount, 300);
        System.out.println();
        System.out.println();

        creditAccount.payAmount(200);
        creditAccount.transfer(savingAcccount, 100);
        creditAccount.addMoney(400);
        System.out.println();
        System.out.println();

        checkingAccount.payAmount(500);
        checkingAccount.transfer(creditAccount, 200);
        checkingAccount.addMoney(1000);
        checkingAccount.payAmount(5000);
        System.out.println();
        System.out.println();
        
        System.out.println("Сберегательный: " + savingAcccount.getBalance() + " руб.");
        System.out.println("Кредитный: " + creditAccount.getBalance() + " руб.");
        System.out.println("Расчетный: " + checkingAccount.getBalance() + " руб.");
        
    }
}
