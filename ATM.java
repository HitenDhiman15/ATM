package com.javatutorials;

import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Account Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter amount to withdraw: ");
        int withdraw = sc.nextInt();

        if (withdraw <= 0) {
            System.out.println("Invalid Withdrawal Amount.");
        } else if (withdraw%100 != 0) {
            System.out.println("Enter amount in multiples of 100.");
        } else if (withdraw > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            System.out.println("Transaction Successful.");
        }
    }
}
