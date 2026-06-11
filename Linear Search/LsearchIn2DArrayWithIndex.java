package com.shannu;
import java.util.Scanner;
import java.util.Arrays;
public class LsearchIn2DArrayWithIndex {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [][] arr= {
                {1,2,3,450},
                {23,56,1,356,2,4},
                {2,4,5,2,3,5,22,66},
                {69,99}
        };
        int target=22;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int [] search(int[][]arr,int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}