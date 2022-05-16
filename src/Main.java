import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 7 numbers (from 0 to 9) :");
        int[] first = new int[7];
        int i = 0;
        while (i < 7) {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            if (n >= 0 && n <= 9) {
                first[i] = n;
            } else {
                System.out.println("Your number should be in range from 0 to 9. Enter your number:");
                continue;
            }
            i++;
        }
        Arrays.sort(first);
        System.out.println("Your numbers are : " + Arrays.toString(first));

        int[] second = new int[7];
        for (int j = 0; j < 7; j++) {
            second[j] = (int) (Math.random() * 10);
        }
        Arrays.sort(second);
        System.out.println("Winning numbers are " + Arrays.toString(second));
        int k = 0;
        for (int j = 0; j < 7; j++) {
            if (first[j] == second[j]) {
                System.out.println("You guessed number  " + (j + 1));
                k++;
            }
        }
        System.out.println("You have total guessed " + k + " numbers.");
    }
}
