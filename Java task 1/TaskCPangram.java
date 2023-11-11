import java.util.Scanner;

public class TaskCPangram {
    // Method to check if a given string is a pangram
    public static boolean isPangram(String str) {
        boolean[] isAlphabetPresent = new boolean[26];
        int count = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Debugging: Print the ASCII value of each character
            System.out.println("Character: " + c + " ASCII: " + (int) c);

            // Check if the character is a lowercase letter
            if (isLowerCaseLetter(c)) {
                int index = c - 'a';

                // If the letter is not present, mark it as present and increment the count
                if (!isAlphabetPresent[index]) {
                    isAlphabetPresent[index] = true;
                    count++;
                }
            }
        }

        // Debugging: Print the count of unique lowercase letters
        System.out.println("Count of unique lowercase letters: " + count);

        // Check if all 26 letters are present
        return count == 26;
    }

    // Helper method to check if a character is a lowercase letter
    public static boolean isLowerCaseLetter(char c) {
        return (c >= 'a' && c <= 'z');
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input is a pangram
        boolean isPangram = isPangram(input);

        // Display the result
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }
}
