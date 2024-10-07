import java.io.*;


public class CoinPiles{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int noOfCoinPiles = Integer.parseInt(br.readLine());

        int[][] coinPiles = new int[noOfCoinPiles][2];

        int idx = 0;
        while(idx != noOfCoinPiles){
            String[] input = br.readLine().split(" ");
            coinPiles[idx][0] = Integer.parseInt(input[0]);
            coinPiles[idx][1] = Integer.parseInt(input[1]);
            int x = coinPiles[idx][0];
            int y = coinPiles[idx][1];

            if((Math.min(x, y)*2 >= Math.max(x, y)) && (x+y)%3==0){
                output.append("YES\n");
            }else{
                output.append("NO\n");
            }

            idx++;
        }

        System.out.println(output.toString());
    }
}

