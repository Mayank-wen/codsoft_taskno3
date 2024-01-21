import java.util.Scanner;

class Atm {
    double balance = 9999;
    double withdraw;
    double deposit;

    double withdrawing(double withdraw) {
        if (balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println(" System : transaction successful");
            System.out.println(" System : You withdrew: $" + withdraw);
            System.out.println(" System : Your balance is now: $" + balance);
        } else {
            System.out.println("System : transaction failed");

            System.out.println( "System : You do not have enough money");
        }
        return balance;
    }

    double depositing(double deposit) {
        balance = balance + deposit;
        System.out.println(" System: You deposited: " + deposit);
        System.out.println(" System: Your balance is now: $" + balance);
        return balance;

    }

    void checkBalance() {
        System.out.println("System: Your balance is: $" + balance);
    }
}

public class User_account {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Atm atm = new Atm();

        System.out.println(" System: Welcome to the ATM Machine");
        System.out.println(" System: we updated your balance to  $9999");
        System.out.println(" System: Please select from the following options");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        int option = input.nextInt();
        switch (option) {
            case 1:
                atm.checkBalance();
                break;
            case 2:
                System.out.println(" System: Please enter the amount you would like to withdraw");
                atm.withdraw = input.nextDouble();
                atm.withdrawing(atm.withdraw);
                break;
            case 3:
                System.out.println(" System: Please enter the amount you would like to deposit");
                atm.deposit = input.nextDouble();
                atm.depositing(atm.deposit);;
                break;
            default:
                System.out.println("System: Invalid option");

                break;

        }
          System.out.println("System: Thank you for using our ATM Machine");
    }
}