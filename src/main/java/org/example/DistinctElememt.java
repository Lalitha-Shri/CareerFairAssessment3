package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctElememt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total element");
        int num = in.nextInt();
        System.out.println("Enter the array elements");
        int a[] = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = in.nextInt();
        }
        Boolean b = distinctElementInArray(a);
        System.out.println(b);
    }

    private static Boolean distinctElementInArray(int[] a) {
        Set<Integer> s = new HashSet();
        for (int c : a) {
            s.add(c);
        }
        if (s.size() != a.length)
            return true;
        else
        return false;
    }
}

