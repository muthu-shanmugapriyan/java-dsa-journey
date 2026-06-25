package com.shannu;

public class Pattern8 {
    static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for(int row=1;row<2*n;row++){
            int rowNo=0;
            int spaces=0;
            if(row>n){
                rowNo=n-(row-n);
                spaces=row-n;
            }
            else{
                rowNo=row;
                spaces=n-row;
            }
            for(int s=1;s<=spaces;s++){
                System.out.print("  ");
            }
            for (int col=rowNo;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col =2;col<=rowNo;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
