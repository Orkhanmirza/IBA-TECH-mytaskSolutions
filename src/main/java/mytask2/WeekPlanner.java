package mytask2;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "Do homework";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "go to football";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "go to swim";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "go to walk";
        schedule[4][0] = "Friday";
        schedule[4][1] = "go to run";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "go to course";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "watch a flim";

        while (true){
            System.out.println("Enter week day,please:");
            int weekDay = scanner.nextInt();
            if (weekDay > 7 || weekDay < 0) {
                System.out.println("Pelase correct week day");
            } else {
                for (int j = 0; j < schedule[weekDay-1].length; j++) {
                    System.out.println(schedule[weekDay - 1][j]);
                }
            }
        }
    }
}