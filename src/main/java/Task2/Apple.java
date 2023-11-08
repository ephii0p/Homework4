package Task2;

import java.util.Scanner;

public class Apple {
    //public static String name = "Иван";

    public static void main(String[] args) {
        String name = "Иван";
        System.out.println("Введите число яблок");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        getAppleAddition(x, name);
    }

    public static void getAppleAddition(int num, String name) {
        int preLastDigit = num % 100 / 10;
        String s;
        if (preLastDigit == 1) {
            s = "яблок";
        }
        switch (num % 10) {
            case 1:
                s = "яблоко";
                break;
            case 2:
            case 3:
            case 4:
                s = "яблока";
                break;
            default:
                s = "яблок";
                break;
        }
        System.out.println(name + " хранит у себя " + num + " " + s);
    }
}
