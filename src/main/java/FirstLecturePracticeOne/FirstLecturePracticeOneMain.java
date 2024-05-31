package FirstLecturePracticeOne;

public class FirstLecturePracticeOneMain {

    public void firstLecturePracticeOne() {

        //Creating BankAccount 
        BankAccount zimAccount = new BankAccount();

        //Initialize account number
        zimAccount.accountNumber = 10001;

        //Calling deposit method
        zimAccount.deposit(5000);

        //Calling withdraw method 
        zimAccount.withdraw(1000);
    }
}
