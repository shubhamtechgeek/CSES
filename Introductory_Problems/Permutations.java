package Introductory_Problems;

//package org.dsaPrep.Cses.Introductory;
 
import java.util.Scanner;
 
public class Permutations {
 
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();

            int n = scanner.nextInt();

            if(n == 1) {
                System.out.println(1);
                return;
            }
            if(n < 4) {System.out.println("NO SOLUTION"); return;}
            int odd = 1;
            int even = 2;
            while (even <= n) {
                sb.append(even + " ");
                even += 2;
            }
            while (odd <= n) {
                sb.append(odd + " ");
                odd += 2;
            }

            System.out.print(sb.toString());
        }
    }
}
 
 
//1
 
//[1] -> No Solution
//[1, 2] -> No Solution
//[1, 2, 3] -> No Solution
//[2, 4, 1, 3] -> print  -> 4
//[1, 3, 5, 2, 4]        -> 5
//[2, 4, 6, 1, 3, 5]     -> 6
//[1, 3, 5, 7, 2, 4, 6]  -> 7