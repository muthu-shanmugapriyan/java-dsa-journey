package com.shannu;

public class Pattern4 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row=1;row<=n;row++){
            int num=1;
            for(int col=1;col<=row;col++){
                //or can just print col.
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }

    }

}
