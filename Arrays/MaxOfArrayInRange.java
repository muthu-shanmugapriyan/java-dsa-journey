package com.shannu;
import java.util.Arrays;

public class MaxOfArrayInRange {
    static void main(String[] args) {
        int [] arr={25,36,4,9,68,95,57,36};
        int ans=  maxRange(arr,1,5);
        System.out.println(ans);
    }
    static int maxRange(int [] arr,int start, int end){
        int maxval=arr[start];
        for (int i =start;i<=end;i++){
            if (arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}

