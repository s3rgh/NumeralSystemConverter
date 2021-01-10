package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sourceBase = scanner.nextInt();
        int number = scanner.nextInt();
        int newBase = scanner.nextInt();
        int decimalNumber;
        if (sourceBase == 1 && newBase == 1) {
            System.out.println(number);
        } else if (sourceBase == 10 && newBase == 1) {
            System.out.print("1".repeat(number));
        } else if (sourceBase == 1) {
            decimalNumber = String.valueOf(number).length();
            System.out.println(Integer.toString(decimalNumber, newBase));
        }  else {
            decimalNumber = Integer.parseInt(String.valueOf(number), sourceBase);
            System.out.println(Integer.toString(decimalNumber, newBase));
        }
    }
}