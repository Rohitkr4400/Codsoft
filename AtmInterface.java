package CodSoft_Task;

import java.util.Scanner;
class BankAccount {
    private double Balance;
    static BankAccount b = new BankAccount();
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }
    public static void withdrawAmount(double amount) {

        if (amount > b.Balance)
            System.out.println("YOU HAVE UNSUFFIECIENT BALANCE !");
        double newBalance = 0;
        newBalance = b.Balance - amount;
        System.out.println("YOUR AMOUNT WITHDRAWN IS = " + amount + " YOUR NEW BALANCE IS = " + newBalance);
        b.Balance = newBalance;
        menu();
    }

    public static void depositAmount(double amount) {
        double newBalance = b.Balance + amount;
        System.out.println("YOUR AMOUNT DEPOSITED IS = " + amount + " YOUR NEW BALANCE IS = " + newBalance);
        b.Balance = newBalance;
        menu();
    }
    public static void checkBlanace() {
        System.out.println("YOUR AVAILABLE BALANCE IS = " + b.Balance);
        menu();
    }

    public static void exits() {
        return;
    }
    public static void menu() {
        System.out.println("1) YOUR WITHDRAW AMOUNT ");
        System.out.println("2) YOUR DEPOSIT  AMOUNT ");
        System.out.println("3) YOUR CHECK  AMOUNT ");
        System.out.println("4) EXIT ");
        System.out.println(" CHOOSE YOUR OPERATION ");

        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();

        switch (ch) {
            case 1:
                System.out.println("ENTER YOUR AMOUNT : ");
                Double amt = s.nextDouble();
                withdrawAmount(amt);
                break;
            case 2:
                System.out.println("ENTER YOUR AMOUNT : ");
                Double amt1 = s.nextDouble();
                depositAmount(amt1);
                break;
            case 3:
                checkBlanace();
                break;
            case 4:
                exits();
                break;
            default:
                System.out.println("INVALID INPUT : ");
                break;
        }
        s.close();
    }
}
public class AtmInterface extends BankAccount {

    public static void main(String[] args) {

        System.out.println(" WELCOME TO ATM ");
        menu();
    }
}
