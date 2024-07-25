package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        Boolean b=isHappy(num);
        System.out.println(b);
    }

    private static Boolean isHappy(int num) {
        Set<Integer> number=new HashSet<>();
        while(num!=1)
        {
            int current=num;
            int sum=0;
            while(current !=0)
            {
                int rem=current%10;
                sum=sum+(rem*rem);
                current=current/10;

            }
            if(number.contains(sum))
            return false;
            num=sum;
            number.add(num);
        }
        return true;
    }
}
