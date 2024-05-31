package FirstLecturePracticeOne;

public class BankAccount {

    //instance variable
    int accountNumber;
    double balance;

    //Diposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Account No: " + accountNumber);
            System.out.println("Deposite amount: " + amount);
            System.out.println("New balance : " + balance);
        } else {
            System.out.println("Deposite amount must be positive.");
        }
        System.out.println("");
    }

    //Withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Account No: " + accountNumber);
                System.out.println("Withdre amount: " + amount);
                System.out.println("New balance : " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
        System.out.println("");
    }

}
