package patterns;

import java.util.Scanner;

public class LetterS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the letter S (odd number): ");
        int height = scanner.nextInt();
        if (height % 2 == 0) {
            System.out.println("Please enter an odd number for the height.");
        } else {
            for (int i = 0; i < height; i++) {
                if (i == 0 || i == height - 1) {
                    for (int j = 0; j < height; j++) {
                        System.out.print("*");
                    }
                } else if (i == height / 2) {
                    for (int j = 0; j < height / 2 + 1; j++) {
                        System.out.print("*");
                    }
                } else if (i < height / 2) {
                    System.out.print("*");
                    for (int j = 0; j < height - i - 1; j++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}

