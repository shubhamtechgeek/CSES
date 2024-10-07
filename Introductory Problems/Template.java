import java.io.*;



public class Template {
    

    public static void main(String[] args) throws IOException {
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        System.out.println(sb.toString());
        int idx = n;

        String[] input = new String[n];
        int[] arr = new int[n];

        while (--idx >= 0) {
            
            input = br.readLine().split(" "); 

        }

        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

    }

}
