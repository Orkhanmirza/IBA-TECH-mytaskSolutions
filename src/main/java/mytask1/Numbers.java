package mytask1;

import java.util.Random;
import java.util.Scanner;

public class Numbers {

    static int[] arr = new int[100];
    static int index = 0;
    static final String MESSAGE_1 = " Your number is too small. Please try again..";
    static final String MESSAGE_2 = " Your number is too big. Please, try again..";

    public static void main(String[] args) {
        startToGame();
    }

    public static void startToGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start game.");
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        int b = 0;
        do {
            Random random = new Random();
            int programNumber = random.nextInt(100);
            System.out.println("Please enter your number:");
            int yourNumber = scanner.nextInt();
            scanner.nextLine();
            saveNumber(yourNumber);
            if (programNumber > yourNumber) {
                System.out.println("Program number :" + programNumber + " Your number:" + yourNumber + Numbers.MESSAGE_1);
                b = goToBackOrQuit(b);
            } else if (programNumber < yourNumber) {
                System.out.println("Program number :" + programNumber + " Your number:" + yourNumber + Numbers.MESSAGE_2);
                b = goToBackOrQuit(b);
            } else {
                System.out.println(" Congratulations," + name + " !.");
                b = goToBackOrQuit(b);
            }
        } while (b == 0);
    }

    public static void saveNumber(int a) {

        arr[index] = a;
        index++;
        System.out.println("Your numbers:");

        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int goToBackOrQuit(int b) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 0 to back   or enter something to exit:");
        return b = scanner.nextInt();
    }
}
