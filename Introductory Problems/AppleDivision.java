import java.io.*;

public class AppleDivision{

    public static void main(String[] arrgs) throws IOException{

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" "); 
        int[] arr = new int[n]; 

        long min = Long.MAX_VALUE;
        long totalSum  =0;
        for(int i = 0; i < input.length; i++){
             arr[i] = Integer.parseInt(input[i]);
             totalSum += arr[i];
        }
        //first time using bit  masking to solve a problem
        //approach -> go through every bit & check with the help of an and operator 
        //that 1 is present or not, if present then just simply add that element
        //to subSet sum, in this way if the String/array given to us has 5 elements
        //maximum possible bitString is 11111, which is sum of all elements
        //in case it does not match move on to next, and every time keep comparing if
        //the new subset sum is minimum or not.


        for(int mask = 0; mask < (1 << n); mask++){//basically in this case -> i << n =>32

            long subsetSum  = 0;
            
            for(int i = 0; i < n; i++){

            if((mask & (1 << i)) != 0){ // compare mask value with all values till 32. like -> 1, 2, 4, 8, 16, 32

                subsetSum += arr[i]; 

            }}


            long otherSum = totalSum - subsetSum;

            long diff  = Math.abs(subsetSum - otherSum);

            min = Math.min(min, diff);

        }

        System.out.println(min);



        
    }
}