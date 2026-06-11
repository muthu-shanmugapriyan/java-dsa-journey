package com.shannu;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        int[] arr={52,35,48,369,152,42};
        int ans=linearSearch(arr,n);
        if(ans!=-1) {
            System.out.println("The number " + n + " is found at the index " + ans);
        }
        else{
            System.out.println("The number is " + n + " is not found");
        }
    }
    static int linearSearch(int[]arr,int n){
        if (arr.length==0){
            return -1;
        }
        for (int i=0; i<arr.length;i++){
            int element=arr[i];
            if (element==n){
                return i;
            }
        }
        return -1;
    }
}