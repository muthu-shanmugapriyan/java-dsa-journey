package com.shannu;

import java.util.Scanner;

public class conditionals{
            static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter your salary: ");
                int salary= in.nextInt();
                if(salary>10000){
                    int bonus=2000;
                    salary=salary+bonus;
                    System.out.println("Your Bonus is : "+bonus+ " And yout total Ammount is :  "+ salary);
                }
                else {
                    int bonus=1000;
                    salary=salary+bonus;
                    System.out.println("Your Bonus is : "+bonus+ " ,And your total Ammount is :  "+ salary);

                }


            }
}