package Introductory_Problems;

import java.util.Scanner;
 
public class Repetitions {
 
    public static void main(String[] args) {
 
        Scanner scan = new Scanner(System.in);
 
        String str = scan.next();
 
        int max = 1;
        int count=1;
        for (int i = 1; i < str.length(); i++) {
 
            if(str.charAt(i) != str.charAt(i-1)){
                count = 1;
            }
            if(str.charAt(i) == str.charAt(i-1)){
                count+=1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);

        scan.close();
    }

}
