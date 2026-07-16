package com.arrays;

import java.util.ArrayList;

public class LinearSearchWithDuplicates {
    static void main(String[] args) {
        int [] arr = {1,2,3};
        ArrayList<Integer>ans=search(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }
//    static ArrayList<Integer> list= new ArrayList<>();
    static ArrayList<Integer> search(int[]arr,int target,int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
