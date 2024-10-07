import java.io.*;
 
public class TrailingZeros {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        // Calculate number of trailing zeros in n!
        int trailingZeros = countTrailingZeros(n);
        
        // Output the result
        System.out.println(trailingZeros);
    }

    // Method to count trailing zeros in n!
    public static int countTrailingZeros(int n) {
        int count = 0;
        
        // Count factors of 5
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        
        return count;
    }
}
