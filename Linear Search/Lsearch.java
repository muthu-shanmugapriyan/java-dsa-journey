package com.shannu;
import java.util.Scanner;
import java.util.Arrays;
public class Lsearch {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [] arr= {21,52,47,68,95};
        int n= in.nextInt();

        boolean found= false;

        for (int i =0; i <arr.length;i++){
            if(arr[i]==n){
                found = true;
            }
        }
        if (found){
            System.out.println("The no "+n+" Exists.");
        }
        else {
            System.out.println("The no "+n+" doesn't Exist.");
        }

    }
}