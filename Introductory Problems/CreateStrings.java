import java.util.*;
import java.io.*;

public class CreateStrings {

    private static void createPermutations(char[] charArray, List<String> allStrings, StringBuilder currentString, boolean[] usedChar){

        if(charArray.length == currentString.length()){
            allStrings.add(currentString.toString());
            return;
        }
            for(int i = 0; i < charArray.length; i++){

                if(usedChar[i]) continue;
                if(i > 0 && charArray[i] == charArray[i-1] && !usedChar[i-1]) continue;

                usedChar[i] = true;
                currentString.append(charArray[i]);

                createPermutations(charArray, allStrings, currentString, usedChar);
                
                currentString.deleteCharAt(currentString.length()-1);
                usedChar[i]  = false;
        }

    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        char[] charArray = str.toCharArray();

        boolean[] usedChar = new boolean[charArray.length];

        Arrays.sort(charArray);

        List<String> allStrings = new ArrayList<>();

        createPermutations(charArray, allStrings, new StringBuilder(), usedChar);

        sb.append(allStrings.size() + "\n");

        for(String st : allStrings){
            sb.append(st + "\n");
        }

        System.out.println(sb.toString());

    }
}