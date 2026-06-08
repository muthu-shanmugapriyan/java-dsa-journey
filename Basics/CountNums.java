package com.shannu;

import java.util.Scanner;

public class CountNums {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        long n = in.nextLong();
        System.out.print("enter number to check: ");
        int r = in.nextInt();
        int count = 0;
        while (n > 0) {
            long rem = n % 10;
            if (rem == r) {
                count++;
            }
            n = n / 10;
        }
        if (count == 1) {
            System.out.println("The Number " + r + " is Repeated " + count + " time.");
        } else if (count > 1) {
            System.out.println("The Number " + r + " is Repeated " + count + " times.");
        }
        if (count == 0) {
            System.out.println("The Number " + r + " is not found in the given Number");
        }

    }
}
