import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Randomnum = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        int[] array = {};
        int attempt = 0;
        boolean guessed = true;
        System.out.println("Please enter your number:");
        while (guessed) {

            int number = sc.nextInt();
            if (number < Randomnum) {
                System.out.println("Your number is too small. Please, try again.");
                array = Arrays.copyOf(array, array.length + 1);
                array[attempt] = number;
                attempt++;
            } else if (number > Randomnum) {
                System.out.println("Your number is too big. Please, try again.");
                array = Arrays.copyOf(array, array.length + 1);
                array[attempt] = number;
                attempt++;
            } else if (number == Randomnum) {
                System.out.println("Congratulations " + name + "!");
                guessed = false;
            }

            System.out.println("Please enter your number:");


        }
        Arrays.sort(array);
        System.out.println("Your numbers are:");
        for (int i = attempt-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

