package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceBase = 0;
        try {
            sourceBase = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("error");
        }
        String number = scanner.next();
        int newBase = 0;
        try {
            newBase = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("error");
        }
        if (sourceBase < 1 || sourceBase > 36 || newBase < 1 || newBase > 36) {
            System.out.println("error");
        } else {
            DigitConverter.convertStrategy(sourceBase, number, newBase);
        }
    }
}