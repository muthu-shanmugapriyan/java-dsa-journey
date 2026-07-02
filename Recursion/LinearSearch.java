package com.arrays;

public class LinearSearch {
    static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        boolean ans=search(arr,3,0);
        System.out.println(ans);
    }
    static boolean search(int []arr,int target , int index){
        if(index> arr.length-1){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
}
