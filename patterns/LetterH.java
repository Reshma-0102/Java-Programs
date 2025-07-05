package patterns;

import java.util.Scanner;

public class LetterH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the letter H (odd number): ");
        int height = scanner.nextInt();
        if (height % 2 == 0) {
            System.out.println("Please enter an odd number for the height.");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < height; j++) {
                    if (j == 0 || j == height - 1 || i == height / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
