import java.util.*;

public class VisualizePermutation {

    // Function to generate all distinct permutations using backtracking
    public static void generatePermutations(char[] chars, boolean[] used, StringBuilder current, List<String> result, int depth) {
        // Base case: if current permutation length matches the input string length
        if (current.length() == chars.length) {
            result.add(current.toString());  // Add the permutation to the result list
            System.out.println("PERMUTATION FOUND: " + current.toString());
            return;
        }

        // Try every unused character, ensuring lexicographical order and skipping duplicates
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Depth: " + depth + ", Index: " + i + ", Current: " + current.toString());
            
            // Display why we are skipping this character
            if (used[i]) {
                System.out.println("Skipping chars[" + i + "] = '" + chars[i] + "' because it is already used.");
                continue;  // Skip if character is already used
            }
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                System.out.println("Skipping chars[" + i + "] = '" + chars[i] + "' because it would create a duplicate (previous not used).");
                continue;  // Skip duplicates
            }

            // Use this character and mark it as used
            used[i] = true;
            current.append(chars[i]);
            System.out.println("Using chars[" + i + "] = '" + chars[i] + "' -> Current permutation: " + current.toString());

            // Recur to generate the next character in the permutation
            generatePermutations(chars, used, current, result, depth + 1);

            // Backtrack: remove the character and mark it as unused
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
            System.out.println("Backtracking, removed chars[" + i + "] = '" + chars[i] + "', current: " + current.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Read input string

        char[] chars = input.toCharArray();
        Arrays.sort(chars);  // Sort characters to ensure lexicographical order

        List<String> result = new ArrayList<>();  // List to store unique permutations
        boolean[] used = new boolean[chars.length];  // Track which characters have been used

        System.out.println("\nStarting Permutation Generation...\n");
        // Start backtracking to generate all distinct permutations
        generatePermutations(chars, used, new StringBuilder(), result, 0);

        System.out.println("\nAll Permutations:");
        for (String perm : result) {
            System.out.println(perm);
        }

        System.out.println("\nTotal unique permutations: " + result.size());
        scanner.close();
    }
}
