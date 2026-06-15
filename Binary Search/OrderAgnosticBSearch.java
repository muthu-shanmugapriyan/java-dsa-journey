package com.shannu;

public class OrderAgnosticBSearch {
    static void main(String[] args) {
        int [] arr={1,10,20,30,40,50,60,70,80,90,100};
        int[] arr1={100,90,80,70,60,50,40,30,20,10,1};
        int target=80;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if (target>arr[mid]){
                    start=mid+1;
                }
            }
            if(!isAsc){
                if (target< arr[mid]){
                    start=mid+1;
                }
                else if(target> arr[mid]){
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
