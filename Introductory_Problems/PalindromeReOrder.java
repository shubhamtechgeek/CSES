package Introductory_Problems;

import java.io.*;

public class PalindromeReOrder {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] npl = br.readLine().toCharArray();
        int[] freq = new int[26];
        int oddCount = 0;
        String middle = "";
        StringBuilder firstHalf = new StringBuilder();
        
        for(char ch : npl){
            freq[ch - 'A']++; 
        }

        for(int i = 0; i < 26; i++){

            if(freq[i]%2 != 0){
                oddCount++;
                middle = String.valueOf((char)(i+'A'));
            }

            if(oddCount > 1){
                System.out.println("NO SOLUTION");
                return;
            }

            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append((char) (i + 'A')); // Build the first half of the palindrome
            }
        }
    
        System.out.println(String.valueOf(firstHalf.toString() + middle + firstHalf.reverse().toString()));
    }
}