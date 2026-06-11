package com.shannu;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearchWithInput {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int n=in.nextInt();
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