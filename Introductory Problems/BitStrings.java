import java.io.*;
import java.math.BigInteger;
 
public class BitStrings {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger base = BigInteger.valueOf(2);
        BigInteger possibleStrings = base.pow(n);
        BigInteger takeModulo = BigInteger.valueOf(1000000007);
        BigInteger withModulo = possibleStrings.mod(takeModulo);
        System.out.println(withModulo);
    }
}
