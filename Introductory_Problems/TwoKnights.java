package Introductory_Problems;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoKnights
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
        if(n == 1) {
            System.out.println(0);
            return;
        }

		for(int j = 1; j <= n; j++){
			
			long totalWays = (long)(j*j)*(j*j - 1)/2;
			long attackingPositions = (long)4*(j-1)*(j-2);
			long nonAttackingWays = totalWays - attackingPositions;
			System.out.println(nonAttackingWays);
			
		}
	}
}