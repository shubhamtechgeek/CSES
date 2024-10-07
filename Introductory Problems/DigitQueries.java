import java.io.*;

public class DigitQueries {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int q = Integer.parseInt(br.readLine());

        long[] minElement = new long[19]; 
        long[] digits = new long[19];

        minElement[0] = 1;

        for (int i = 1; i < 19; i++) {
            minElement[i] = minElement[i-1]*10; 
            digits[i] = (minElement[i] - minElement[i-1])*i + digits[i-1];
        }

        while(q-- > 0){

            long k = Long.parseLong(br.readLine());

            int numDigits = 1;
            while (k > digits[numDigits]) {
                numDigits++;
            }

            k -= digits[numDigits - 1]; 
            long num = minElement[numDigits - 1] + (k - 1) / numDigits;

            int digitIndex = (int) ((k - 1) % numDigits);
            sb.append(String.valueOf(num).charAt(digitIndex)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
