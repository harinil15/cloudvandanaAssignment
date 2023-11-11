import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TaskOneSuffledArray{
    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        shuffleArray(array);

        System.out.print("Shuffled Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
