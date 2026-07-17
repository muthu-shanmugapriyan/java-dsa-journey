package com.backtracking;

import java.util.ArrayList;

public class MazeInList {
    static void main(String[] args) {
        ArrayList<String>ans=path("",3,3);
        System.out.println(ans);
    }
    static ArrayList<String> path(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        if(r>1&&c>1){
            ans.addAll(path(p+'D',r-1,c-1));
        }
        if(r>1){
           ans.addAll(path(p+'v',r-1,c)) ;
        }
        if(c>1){
           ans.addAll(path(p+'H',r,c-1)) ;
        }
        return ans;
    }
}
