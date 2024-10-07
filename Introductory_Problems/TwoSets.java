package Introductory_Problems;

import java.io.*;
import java.util.*;

class TwoSets {
    private static int checkIfSumEven(long n) {
        if (n % 2 == 1) {
            System.out.println("NO");
            return 0;
        }

        System.out.println("YES");
        return 1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if (n == 1 || n == 2) {
            output.append("NO\n");
            System.out.print(output.toString());
            return;
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Check if the sum of 1 to n is even
        if (checkIfSumEven((long) n * (n + 1) / 2) == 0) {
            return;
        } else {
            long targetSumForSet = ((long) n * (n + 1)) / 4;
            long maxElement = n;

            while (targetSumForSet != 0) {
                if (targetSumForSet <= maxElement) {
                    set1.add((int) targetSumForSet);
                    targetSumForSet = 0;
                } else {
                    set1.add((int) maxElement);
                    targetSumForSet -= maxElement;
                    maxElement--;
                }
            }

            // Add remaining elements to set2
            for (int i = 1; i <= n; i++) {
                if (!set1.contains(i)) {
                    set2.add(i);
                }
            }

            output.append(set1.size()).append("\n");
            for (int num : set1) {
                output.append(num).append(" ");
            }
            output.append("\n");

            output.append(set2.size()).append("\n");
            for (int num : set2) {
                output.append(num).append(" ");
            }
            output.append("\n");

            System.out.print(output.toString());
        }
    }
}
