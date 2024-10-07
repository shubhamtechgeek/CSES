package Introductory_Problems;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n - 1; i++) {
                int temp = scan.nextInt();
                arr[temp - 1] = temp;
            }

            for (int j = 0; j < n; j++) {
                if (arr[j] != j + 1) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}
