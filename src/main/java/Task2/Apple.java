package Task2;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        System.out.println("Введите число яблок");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Иван хранит у себя " + x + " " + getAppleAddition(x));
    }

    public static String getAppleAddition(int num) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) {
            return "яблок";
        }
        switch (num % 10) {
            case 1:
                return "яблоко";
            case 2:
            case 3:
            case 4:
                return "яблока";
            default:
                return "яблок";
        }
    }
}
