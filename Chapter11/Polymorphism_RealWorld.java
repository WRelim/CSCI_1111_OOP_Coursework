package com.company;

import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.*;

public class Polymorphism_RealWorld {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccount(1122,20000,4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance: " + acc.Balance() + " Monthly Interest: " + acc.getMonthlyInterest() + " Date Created: " + acc.DateCreated());
        System.out.println(acc.toString());

        SavingsAccount saveAcc = new SavingsAccount();
        saveAcc.setAccount(2233,20000,5.0);
        saveAcc.SavingsAccount(12500.0);
        System.out.println(saveAcc.toString());

        CheckingAccount checkAcc = new CheckingAccount();
        checkAcc.setAccount(3344,200,5.0);
        checkAcc.CheckingAccount(15000.0, 500.0);
        System.out.println(checkAcc.toString());
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
        public String toString() {
            return "There is $" + balance + " in your account.";
        }
    }
    static class SavingsAccount extends Account{
        //Can not be overdrawn
        private double overdraftLimit = 0;
        double savingsBalance;

        SavingsAccount() {
            savingsBalance = 0.0;
        }
        public void SavingsAccount(double newSavingsBalance) {
            savingsBalance = newSavingsBalance;
        }
//        @Override
        public String toString() {
            return "There is $" + savingsBalance + " in your savings account.";
        }
    }
    static class CheckingAccount extends Account{
        //Can be overdrawn
        private double overdraftLimit;
        double checkingBalance;

        CheckingAccount() {
            checkingBalance = 0.0;
            overdraftLimit = -500.0;
        }
        public void CheckingAccount(double newCheckingBalance, double checkingOverdraft) {
            checkingBalance = newCheckingBalance;
            overdraftLimit = checkingOverdraft;
        }
        public String toString() {
            return "There is $" + checkingBalance + " in your checking account.";
        }
    }
}
