package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        switch (base) {
            case 2:
                System.out.printf("0b%s", Long.toString(number, base));
                break;
            case 8:
                System.out.printf("0%s", Long.toString(number, base));
                break;
            case 16:
                System.out.printf("0x%s", Long.toString(number, base));
                break;
            default:
        }
    }
}
