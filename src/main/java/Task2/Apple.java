package Task2;

import java.util.Scanner;

public class Apple {

    public static void main(String[] args) {
        System.out.println("Введите число яблок");
        Scanner scanner = new Scanner(System.in);
        int quantityApple = scanner.nextInt();
        getAppleAddition(quantityApple, "Иван");
    }

    public static void getAppleAddition(int num, String name) {
        String appleName;

        switch (num % 10) {
            case 1:
                appleName = "яблоко";
                break;
            case 2:
            case 3:
            case 4:
                appleName = "яблока";
                break;
            default:
                appleName = "яблок";
                break;
        }
        switch (num) {
            case 11:
            case 12:
            case 13:
            case 14:
                appleName = "яблок";
                break;
        }
        System.out.println(name + " хранит у себя " + num + " " + appleName);
    }
}