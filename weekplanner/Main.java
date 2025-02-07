import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[1][0] = "Monday";
        schedule[2][0] = "Tuesday";
        schedule[3][0] = "Wednesday";
        schedule[4][0] = "Thursday";
        schedule[5][0] = "Friday";
        schedule[6][0] = "Saturday";
        schedule[0][1] = "do tasks";
        schedule[1][1] = "go to university";
        schedule[2][1] = "go to the uncle's home";
        schedule[3][1] = "go to gym";
        schedule[4][1] = "go to the swimming";
        schedule[5][1] = "go th the seaside";
        schedule[6][1] = "do exercise";
        boolean valid = true;
        Scanner input = new Scanner(System.in);
        while (valid) {
            boolean valid1 = false;
            System.out.print("Please, input the day of the week:");
            String date = input.nextLine().trim().toLowerCase();
            if (date.toLowerCase().equals(("exit"))) {
                System.out.println("Exiting program. Have a nice day!");
                break;
            }
            for (int i = 0; i < schedule.length; i++) {
                String day = schedule[i][0];
                if (day.toLowerCase().equals(date)) {
                    System.out.println("Your tasks for" + schedule[i][0] +  ": " + schedule[i][1]);
                    valid1 = true;
                    break;
                }
            }
            if (date.startsWith("change") || date.startsWith("reschedule")) {
                String day = date.split(" ")[1].trim().toLowerCase();
                for (int i = 0; i < schedule.length; i++) {
                    if (schedule[i][0].toLowerCase().equals(day)) {
                        System.out.println("Please enter, the new task for " + schedule[i][0] + ": " );
                        String task = input.nextLine();
                        schedule[i][1] = task;
                        System.out.println("Succesfully changed the task ");
                        valid1 = true;
                        break;
                    }

                }
            }
            if (!valid1) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
