package org.example;

import java.io.*;
import java.util.*;

public class Solution {

    static void print(int n){
        int x=0;
        System.out.println(x++);
        if (n == 5)
            return;
        print(n-1);
    }
    public static void main(String[] args) {
            print(5);
    }
}