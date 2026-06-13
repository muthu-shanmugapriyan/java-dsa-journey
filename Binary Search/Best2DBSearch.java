package com.shannu;

import java.util.Arrays;

public class Best2DBSearch {
    static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {5,6,7},
                {8,9,10}
        };
        int target=7;
        int [] ansArray=search(arr,target);
        System.out.println(Arrays.toString(ansArray));

    }
    static int [] search(int [][]arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c >= 0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
