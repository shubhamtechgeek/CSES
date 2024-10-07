package Introductory_Problems;

import java.io.*;

public class GrayCode {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int totalNumbers = 1 << n;

        for(int i = 0; i < totalNumbers; i++){
            int grayCode  = i ^ (i >> 1);
            sb.append(String.format("%" + n + "s", Integer.toBinaryString(grayCode)).replace(' ', '0'));
            sb.append("\n");
        }
        
        System.out.println(sb.toString());     
    }    
}
        