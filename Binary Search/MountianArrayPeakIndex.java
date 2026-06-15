package com.shannu;

public class MountianArrayPeakIndex {
    static void main(String[] args) {
        int []arr={1,2,3,5,6,4,3,2};
        int []arr1={1,2,3,1};
        int ans=search(arr1);
        System.out.println(ans);
    }
    static int search(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
           int mid=start+(end-start)/2;
           if(arr[mid]>arr[mid+1]){
               end=mid;
           }
           else{
               start=mid+1;
           }

        }
        return end;
    }

}
