package Introductory_Problems;

import java.util.Scanner;
 
public class WeirdProblem {
 
    public static void main(String[] args) {
 
        try (Scanner scan = new Scanner(System.in)) {
            long n = scan.nextLong();
            System.out.println(n);
            while(n != 1){
                if(n % 2 == 1) n=n*3+1;
                else n=n/2;
                System.out.println(n);
            }
        }
    }
}
