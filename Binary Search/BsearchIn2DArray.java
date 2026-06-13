package com.shannu;

import java.util.Arrays;

public class BsearchIn2DArray {
    static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {10,20,30},
                {100,200,300}
        };
        int target=20;
        int [] ansArray=search(arr,target);
        System.out.println(Arrays.toString(ansArray));

    }
    static int [] search(int [][]arr,int target){
        for(int row=0;row< arr.length;row++){
            int ans=Bsearch(arr[row],target);
                if (ans != -1) {
                return new int []{row,ans};
                }
         }
        return new int[]{-1,-1};
    }
    static int Bsearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

}
