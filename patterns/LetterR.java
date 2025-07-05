package patterns;

import java.util.Scanner;

public class LetterR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of R (n): ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < n; i++) {
            System.out.print("*");

            if (i == 0 || i == n / 2) { 
                for (int j = 1; j < n - 1; j++) {
                    System.out.print("*");
                }
            } else if (i < n / 2) { 
                for (int j = 1; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else { 
                for (int j = 0; j < i - n / 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
}
