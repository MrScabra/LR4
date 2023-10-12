import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Пункт 1: Фрагмент коду з таблиці 5.8
        System.out.println("Пункт 1: Фрагмент коду з таблиці 5.8");
        double d = Math.random() * 100;
        if (d > 75) {
            System.out.println(d * d);
        } else if (d > 50) {
            System.out.println(Math.sqrt(d));
        } else if (d > 25) {
            System.out.println(d + d);
        } else {
            System.out.println(d);
        }

        // Пункт 2: Обчислення системи рівнянь
        System.out.println("\nПункт 2: Обчислення системи рівнянь");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення X, Y та Z:");

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int Q = X * X * X - Y - Z * Z;

        if (X > Y && Y > Z && X > 0) {
            System.out.println("Q = " + Q);
        } else {
            System.out.println("Умови рівняння не виконуються.");
        }

        // Пункт 3: Перевірка наявності великих літер у рядку
        System.out.println("\nПункт 3: Перевірка наявності великих літер у рядку");
        System.out.println("Введіть рядок:");
        String input = scanner.next();
        boolean containsUpperCase = false;

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                containsUpperCase = true;
                break;
            }
        }

        if (containsUpperCase) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }
    }
}
