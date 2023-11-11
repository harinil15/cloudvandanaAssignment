import java.util.Random;
import java.util.Scanner;

public class TaskBRomanNumber{
    public static int romanToInteger(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);
            int currentValue = getRomanValue(currentChar);

            if (i < roman.length() - 1) {
                char nextChar = roman.charAt(i + 1);
                int nextValue = getRomanValue(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine();

        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Roman Numeral " + romanNumeral + " is equivalent to " + integerEquivalent);

        scanner.close();
    }
}
