package com.shannu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbers {
    public  static void main(String[] args) {
        int [] arr={1,1};
        System.out.println(missingNums(arr));
    }
    static List<Integer> missingNums(int[]arr){
        sort(arr);
        List<Integer> ans =new ArrayList<>();
        for (int i =0; i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(i+1);
            }
        }
    return ans;
    }
    static void sort(int []arr){
        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
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
