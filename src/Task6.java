import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysInYear = 0;
        System.out.println("Введите год = ");
        int year = scan.nextInt();
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println("Високосный год");
        } else System.out.println("Обычный год");
    }
}
