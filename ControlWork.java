import java.util.Scanner;

public class ControlWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("Первая задача:");
        System.out.println("Введите пожалуйста на вход 2 целых числа.");
        System.out.print("Первое число - ");
        int a = sc.nextInt();
        System.out.print("Второе число - ");
        int b = sc.nextInt();
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + (a + b));
        System.out.println("Подходит условию - " + First_Ex(a, b));
        System.out.println("\nВторая задача:");
        Second_Ex();
        System.out.println();
        System.out.println("\nТретья задача:");
        Third_Ex();
        System.out.println();
    }

    private static boolean First_Ex(int h, int j) {
        return ((h + j) >= 10) & ((h + j) <= 20);
    }

    private static void Second_Ex() {
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
    }

    private static void Third_Ex() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int value : arr) {
            if (value < 6) {
                value *= 2;
            }
            System.out.print(value + " ");
        }
    }
}
