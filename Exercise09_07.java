package com.company;
import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.*;

public class Exercise09_07 {
    public static void main(String[] args) {

    }
    class Account {
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
            return annualInterestRate / 12;
        }
        double getMonthlyInterest() {
            return balance * (annualInterestRate / 12);
        }
        double withdraw(double withdrawal) {
            return balance -= withdrawal;
        }
        double deposit(double deposit) {
            return balance += deposit;
        }
    }
}
