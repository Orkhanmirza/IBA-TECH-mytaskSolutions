package mytask2;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] schedule = new String[7];
        schedule[0] = "Your tasks for Monday:do homework";
        schedule[1] = "Your tasks for Tuesday:go to football";
        schedule[2] = "Your tasks for Wednesday:go to swim";
        schedule[3] = "Your tasks for Thursday:go to walk";
        schedule[4] = "Your tasks for Friday:go to run";
        schedule[5] = "Your tasks for Saturday:go to course";
        schedule[6] = "Your tasks for Sunday:watch a film";

        boolean b = true;
        do {
            System.out.println("Please enter the day of the week:");
            String weekDay = scanner.nextLine();
            switch (weekDay.toLowerCase()) {
                case "monday":
                    System.out.println(schedule[0]);
                    break;
                case "tuesday":
                    System.out.println(schedule[1]);
                    break;
                case "wednesday":
                    System.out.println(schedule[2]);
                    break;
                case "thursday":
                    System.out.println(schedule[3]);
                    break;
                case "friday":
                    System.out.println(schedule[4]);
                    break;
                case "saturday":
                    System.out.println(schedule[5]);
                    break;
                case "sunday":
                    System.out.println(schedule[6]);
                    break;
                case "exit":
                    b = false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, try again.");
            }
        } while (b);

    }
}