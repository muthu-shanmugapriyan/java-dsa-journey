package com.shannu;

public class NoOfRotationsInASortedArray {
    static void main(String[] args) {
        int [] arr={9,2};
        int pivot=Dpivot(arr);
        int ans=rotations(pivot);
        System.out.println(ans);
    }
    static int rotations(int pivot){
        int start=0;
        int boxSize=pivot-start+1;
//        can also just return
//        return pivot +1; since start is always =0;
        return boxSize;
    }
    static int Dpivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int pivot=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                pivot=mid;
                return pivot;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                pivot=mid-1;
                return pivot;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start]> arr[start+1]){
                    pivot=start;
                    return pivot;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    pivot=end-1;
                    return pivot;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||arr[start]== arr[mid] && arr[mid]> arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return pivot;
    }
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int pivot=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                pivot=mid;
                return pivot;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                pivot=mid-1;
                return pivot;
            }
            if(arr[start]<=arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return pivot;
    }
}
