//package org.dsaPrep.Cses.Introductory;
//https://www.youtube.com/watch?v=HQmiQ6Sd_OE
import java.io.*;
 
public class NumberSpiral {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
 
        long[] arrY = new long[n];
        long[] arrX = new long[n];
 
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arrX[i] = Integer.parseInt(input[0]);
            arrY[i] = Integer.parseInt(input[1]);
        }
 
        for (int i = 0; i < n; i++) {
 
            long y = arrY[i];
            long x = arrX[i];
            if(y > x) {
                if(y%2==1){
                    output.append(y*y - (x-1)+ "\n");
                }else{
                    output.append((y-1)*(y-1) + 1 + (x - 1)+ "\n");
                }
            }else {
                if (x%2==0){
                    output.append(x*x - (y - 1)+ "\n");
                }else {
                    output.append((x-1)*(x-1) + 1 + (y - 1)+ "\n");
                }
            }
        }
        System.out.println(output.toString());
    }
}
