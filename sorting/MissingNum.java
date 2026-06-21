package com.shannu;

import java.util.Arrays;

public class MissingNum {
    static void main(String[] args) {
        int []arr={9,6,4,2,3,5,7,0,1};

       int ans=MissingNum(arr);
        System.out.println(ans);

    }
    static int MissingNum(int []arr){
        sort(arr);
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return n;
    }
    static void sort(int []arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
