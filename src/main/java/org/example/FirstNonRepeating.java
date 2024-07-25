package org.example;

import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s)
    {

        int[] freq = new int[26];


        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }


        for (int i = 0; i < s.length(); ++i) {
            //System.out.println(freq[i]);
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
