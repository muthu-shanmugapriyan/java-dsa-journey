package com.shannu;

import java.util.Arrays;

public class FirstMissingPositiveNum {
    static void main(String[] args) {
        int []arr={7,8,9,11,12};
        int ans=MissingNum(arr);
        System.out.println(ans);
    }
    static int MissingNum(int []arr){
        int i=0;
        int n= arr.length;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
