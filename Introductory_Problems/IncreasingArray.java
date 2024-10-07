package Introductory_Problems;

import java.util.Scanner;
 
public class IncreasingArray {
 
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
 
        //var
        int[] arr = new int[n];
        long countMoves = 0;
 
        //traverse > take input
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
 
        for (int idx = 1; idx < n; idx++) {
            int countMoves1 = arr[idx-1] - arr[idx];
 
            if (countMoves1 > 0) arr[idx]+=countMoves1;
            if(countMoves1 > -1) countMoves+= countMoves1;
        }
 
        System.out.println(countMoves);

        scan.close();
 
 
    }
}

