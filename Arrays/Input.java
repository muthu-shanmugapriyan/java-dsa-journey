package com.shannu;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main() {
        Scanner in=new Scanner(System.in);
        int [] arr=new int[5];
        int[] arr2=new int[5];
        for (int i =0; i< arr.length;i++){
            arr[i]=in.nextInt();
//            arr[i]+=1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Reversed array:");
        for (int i =0, j =arr.length-1; i<arr.length;i++,j--){
            arr2[i]=arr[j];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
