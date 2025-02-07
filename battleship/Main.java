import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] place = new char[5][5];
        for (int i = 0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                place[i][j] = '-';
            }
        }
        for (int i = 0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(place[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("All set. Get ready to rumble!");
        int secretrow = (int) (Math.random()*5);
        int secretcol = (int) (Math.random()*5);
        boolean valid = true;

        while (valid) {
            boolean valid2 = true;
            boolean valid3 = true;
            int row = 0;
            int col =0;
            System.out.print("Enter row(1-5): ");
            while (valid2) {
                row = scanner.nextInt();
                if (row > 0 && row < 6) {
                    valid2 = false;
                }
                else {
                    System.out.print("Invalid row: Please try again: ");
                }
            }
            while (valid3) {
                System.out.print("Enter col(1-5): ");
                 col = scanner.nextInt();
                if (col > 0 && col < 6) {
                    valid3 = false;
                }
                else {
                    System.out.print("Invalid col: Please try again: ");
                }
            }
            row--;
            col--;
            if (row == secretrow && col == secretcol) {
                place[row][col] = 'X';
                System.out.println("You have won!");
                break;
            }
            else {
                place[row][col] = '*';
            }
            for (int i = 0;i<5;i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(place[i][j] + " ");
                }
                System.out.println();
            }


        }
        for (int i = 0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(place[i][j] + " ");
            }
            System.out.println();
        }
    }
}

