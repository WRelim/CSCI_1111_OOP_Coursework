import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.*;

public class Exercise10_07_Implementation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] acc = new Account[10];
        //initialize each account with a balance of $100
        for (int loop = 0; loop < acc.length; loop++) {
            acc[loop] = new Account();
            acc[loop].setAccount(loop, 100.0, 0.0);
        }
        for (int loop = 0; loop == 0;) {
            System.out.print("Enter an id: ");
            int idChoice = input.nextInt();
            if (idChoice < 10 && idChoice >= 0) {
                for (int menuLoop = 0; menuLoop < 1;) {
                    System.out.println("Main Menu:");
                    System.out.println("1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit");
                    int menuChoice = input.nextInt();
                    if (menuChoice == 1) {
                        //Check Balance
                        System.out.printf("The account balance is: %.00f\n", acc[idChoice].Balance());
                    }
                    else if (menuChoice == 2) {
                        //Withdrawal
                        System.out.println("Enter an amount to withdraw: ");
                        double userWithdraw = input.nextDouble();
                        acc[idChoice].withdraw(userWithdraw);
                    }
                    else if (menuChoice == 3) {
                        //Deposit
                        System.out.println("Enter an amount to deposit: ");
                        double userDeposit = input.nextDouble();
                        acc[idChoice].deposit(userDeposit);
                    }
                    else {
                        menuLoop++;
                    }
                }
            }
        }
//        acc.setAccount(1122,20000,4.5);
//        acc.withdraw(2500);
//        acc.deposit(3000);
//        System.out.print("Balance: " + acc.Balance() + " Monthly Interest: " + acc.getMonthlyInterest() + " Date Created: " + acc.DateCreated());
    }
    static class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;

        Account() {
            id = 0;
            balance = 0.0;
            annualInterestRate = 0.0;
            dateCreated = new Date();
        }
        void setAccount(int newID, double newBalance, double newAnnualInterestRate) {
            id = newID;
            balance = newBalance;
            annualInterestRate = newAnnualInterestRate;
        }
        //Accessor method
        public int Id(){
            return id;
        }
        //Mutator method
        public void setId(int newId){
            id = newId;
        }
        //Accessor method
        public double Balance(){
            return balance;
        }
        //Mutator method
        public void setBalance(double newBalance){
            balance = newBalance;
        }
        //Accessor method
        public double AnnualInterestRate(){
            return annualInterestRate;
        }
        //Mutator method
        public void setAnnualInterestRate(double newAnnualInterestRate){
            annualInterestRate = newAnnualInterestRate;
        }
        //Accessor method
        public Date DateCreated(){
            return dateCreated;
        }
        double getMonthlyInterestRate() {
            return (annualInterestRate / 100) / 12;
        }
        double getMonthlyInterest() {
            return balance * ((annualInterestRate / 100) / 12);
        }
        double withdraw(double withdrawal) {
            return balance -= withdrawal;
        }
        double deposit(double deposit) {
            return balance += deposit;
        }
    }
}
