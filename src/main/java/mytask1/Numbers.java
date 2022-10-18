package mytask1;

import java.util.Random;
import java.util.Scanner;

public class Numbers {

    static int[] arr = new int[100];
    static int index = 0;

    public static void main(String[] args) {
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
            if (programNumber > yourNumber) {
                System.out.println("Program number :" + programNumber + " Your number:" + yourNumber + " Your number is too small. Please try again..");
                System.out.println("Type 0 to back   or enter something to exit:");
                b = scanner.nextInt();
                scanner.nextLine();
            } else if (programNumber < yourNumber) {
                System.out.println("Program number :" + programNumber + " Your number:" + yourNumber + " Your number is too big. Please, try again..");
                System.out.println("Type 0 to back   or enter something to exit :");
                b = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println(" Congratulations," + name + " !.");
                System.out.println("Type 0 to back   or enter something to exit :");
                b = scanner.nextInt();
                scanner.nextLine();
            }
        } while (b == 0);
    }

    public static void storeNumber(int a) {

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
}
