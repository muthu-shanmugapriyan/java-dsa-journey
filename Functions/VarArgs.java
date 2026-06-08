package com.shannu;

import java.util.Arrays;

public class VarArgs {
    static void main() {

        multiple(1,2,5,86,24,82,52);

    }
    static void multiple(int...v){
        System.out.println(Arrays.toString(v));
    }

}
