package com.company;

public class DesigningClasses_RealWorld {
    public static void main(String[] args) {
        int test = 4;
        char[] letters = new char[3];
        letters[0] = 'a';
        letters[1] = 'b';
        letters[2] = 'c';
        String[] words = new String[3];
        words[0] = "200";
        words[1] = "100";
        words[2] = "935";
        MyInteger integer = new MyInteger(5);
        System.out.println(integer.getMyInteger());
        System.out.println(integer.isEven());
        System.out.println(integer.isEven(6));
        System.out.println(integer.isisEven(6));
        System.out.println(integer.isOdd());
        System.out.println(integer.isOdd(6));
        System.out.println(integer.isisOdd(6));
        System.out.println(integer.isPrime());
        System.out.println(integer.isPrime(6));
        System.out.println(integer.isisPrime(6));
        System.out.println(integer.equals(6));
        System.out.println(integer.isEquals(6));
        System.out.println(integer.parseInt(letters));
        System.out.println(integer.parseInt(words));
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
