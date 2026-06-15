package com.shannu;

public class SearchInRotatedSortedArray {
    static void main(String[] args) {
        int[]arr={4,0,1,2};
        int target=2;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        int pivot=-1;
        while(start<= end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                pivot=mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                pivot=mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            if (arr[start]<arr[mid]){
                start=mid+1;
            }
        }
        if (target==arr[pivot]){
            return pivot;
        }
        if (arr[start] < target) {
            ans=Bsearch(arr,target,0,pivot);
        }
        else{
            ans = Bsearch(arr,target,pivot+1,arr.length-1);
        }
        return ans;
    }
    static int Bsearch(int []arr,int target,int start,int end){
        while(start<=end){
            int mid =start+(end-start)/2;
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
    static int pivot (int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int pivot =-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                pivot=mid;
                return pivot;
            }
            if(mid> start && arr[mid]<arr[mid-1]){
                pivot=mid-1;
                return pivot;
            }
            if(arr[start]==arr[mid]&& arr[mid]==arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    pivot = start;
                    return pivot;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    pivot = end - 1;
                    return pivot;
                }
                end--;
            }
             else if (arr[start]<arr[mid]||arr[start]==arr[mid]&& arr[mid]>arr[end]){
                 start=mid+1;
            }
             else{
                 end=mid-1;
            }
        }
        return -1;
    }

}
