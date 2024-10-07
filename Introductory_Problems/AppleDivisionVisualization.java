package Introductory_Problems;

import java.io.*;

public class AppleDivisionVisualization {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading number of elements
        int n = Integer.parseInt(br.readLine());

        // Reading the input array
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        long totalSum = 0; // Total sum of all elements

        // Parse input and calculate total sum
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
            totalSum += arr[i];
        }

        System.out.println("Total sum of apples: " + totalSum);
        System.out.println("Subsets and their sums:");

        // Iterate through all subsets (there are 2^n subsets)
        // Using bit manipulation to generate all subsets
        for (int mask = 0; mask < (1 << n); mask++) {
            long subsetSum = 0;
            StringBuilder subset = new StringBuilder("Subset: { ");

            // Iterate over each element to see if it is included in the current subset
            for (int i = 0; i < n; i++) {
                // Check if the i-th element is in the subset (using bitmask)
                if ((mask & (1 << i)) != 0) {
                    subset.append(arr[i]).append(" ");
                    subsetSum += arr[i];
                }
            }

            // If the subset is empty, print "Empty subset"
            if (subset.length() == 10) { // "Subset: { " has length 10
                System.out.println("Subset: { Empty } - Sum: 0");
            } else {
                subset.append("}");
                System.out.println(subset + " - Sum: " + subsetSum);
            }
        }
    }
}
