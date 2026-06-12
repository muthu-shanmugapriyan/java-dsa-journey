package com.shannu;

import java.util.Arrays;
import java.util.Scanner;

public class LSMaxValIn2DArr {
    static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int [][] arr= {
                {1,2,3,450},
                {23,56,1,356,2,4},
                {2,4,5,2,30000,5,22,66},
                {69,99}
        };
        int ans= max(arr);
        System.out.println(ans);

    }
    static int  max(int[][]arr){
        int max=arr[0][0];
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
