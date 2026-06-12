package com.shannu;
import java.util.Scanner;
import java.util.Arrays;
public class MinOfArray {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int []arr={25,36,47,652,-9,5,2};
        int ans=min(arr);
        System.out.println(ans);

    }
    static int min(int[]arr){
        int min=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}