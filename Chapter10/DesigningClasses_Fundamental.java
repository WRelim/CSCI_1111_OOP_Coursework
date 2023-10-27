package com.company;

public class DesigningClasses_Fundamental {
    public static void main(String[] args) {
	// write your code here
    }
    static class MyInteger {
        int integer;
        MyInteger(int myInteger) {
            integer = myInteger;
        }
        int getMyInteger() {
            return integer;
        }
        boolean isEven() {
            return (integer % 2 == 0);
        }
        static boolean isEven(int newInteger) {
            return (newInteger % 2 == 0);
        }
        static boolean isisEven(int myInteger) {
            return (myInteger % 2 == 0);
        }
        boolean isOdd() {
            return (integer % 2 != 0);
        }
        static boolean isOdd(int newInteger) {
            return (newInteger % 2 != 0);
        }
        static boolean isisOdd(int myInteger) {
            return (myInteger % 2 != 0);
        }
        boolean isPrime() {
            if (integer <= 1)
                return false;
            for (int loop = 2; loop <= integer / 2; loop++) {
                if ((integer % loop) == 0)
                    return false;
            }
            return true;
        }
        static boolean isPrime(int newInteger) {
            if (newInteger <= 1)
                return false;
            for (int loop = 2; loop <= newInteger / 2; loop++) {
                if ((newInteger % loop) == 0)
                    return false;
            }
            return true;
        }
        static boolean isisPrime(int myInteger) {
            if (myInteger <= 1)
                return false;
            for (int loop = 2; loop <= myInteger / 2; loop++) {
                if ((myInteger % loop) == 0)
                    return false;
            }
            return true;
        }
        boolean equals(int newInteger) {
            return (integer == newInteger);
        }
        boolean isEquals(int myInteger) {
            return (integer == myInteger);
        }
        static int parseInt(char[] charArray) {
            int total = 0;
            int len = charArray.length;
            for (int loop =0; loop < len; loop++) {
                char temp = charArray[loop];
                int value = Integer.valueOf(temp);
                total += value;
            }
            return total;
        }
        static int parseInt(String[] strArray) {
            int total = 0;
            int len = strArray.length;
            for (int loop =0; loop < len; loop++) {
                String temp = strArray[loop];
                int value = Integer.valueOf(temp);
                total += value;
            }
            return total;
        }
    }
}
