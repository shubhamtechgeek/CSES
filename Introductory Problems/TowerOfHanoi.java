import java.io.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int hanoiPossibilities = (1 << n)-1;

        System.out.println(hanoiPossibilities);

        hanoi(n, 1, 3, 2);
    }

    public static void hanoi(int disks, int source, int destination, int auxiliary){

        if(disks == 1){
            System.out.println(source + " " + destination);
            return;
        }

        hanoi(disks-1, source, auxiliary, destination);

        System.out.println(source + " " + destination);

        hanoi(disks-1, auxiliary, destination, source);


    }
}