package Introductory_Problems;

import java.io.*;
 
public class kadane
 {

    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] arrX = new int[n];
 
        for (int i = 0; i < n; i++) {
            arrX[i] = Integer.parseInt(input[i]);
        }


        int best = 0, sum = 0;
        for (int k = 0; k < n; k++) {
            sum = Math.max(arrX[k],sum+arrX[k]);
            best = Math.max(best,sum);
        }
        System.out.println(best);
    }
}