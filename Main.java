package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceBase = scanner.nextInt();
        String number = scanner.next();
        int newBase = scanner.nextInt();
        DigitConverter.convertStrategy(sourceBase, number, newBase);
    }
}