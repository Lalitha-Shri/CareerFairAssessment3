package org.example;

import java.util.HashMap;
import java.util.Scanner;
public class Isomorphic {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        Boolean b=isIsomorphic(s1,s2);
        System.out.println(b);

        }

    private static Boolean isIsomorphic(String s1, String s2) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        if(s1.length()!=s2.length())
            return false;
        else {
            for (int i = 0; i < s1.length(); i++) {
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if((map1.containsKey(a) && map1.get(a)!=b) || (map2.containsKey(b) && map2.get(b)!=a))
            return false;
            map1.put(a,b);
            map2.put(b,a);
            }
            return true;
        }

    }

}