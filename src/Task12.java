import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        System.out.println("Задание №12");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите шестизначное число");
        int number = scan.nextInt();
        int left = (number / 100000) % 10 + (number / 10000) % 10 + (number / 1000) % 10;
        int right = (number / 100) % 10 + (number /10) % 10 + number % 10;
        if (left == right) {
            System.out.println("Да");
        } else System.out.println("Нет");
    }
}
