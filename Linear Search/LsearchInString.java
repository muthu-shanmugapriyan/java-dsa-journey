package com.shannu;

import java.util.Scanner;
import java.util.Arrays;

public class LsearchInString {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Shannu";
        char target = in.next().trim().charAt(0);
        boolean ans = search(name, target);
        System.out.println(ans);

    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }
        return false;
    }
}