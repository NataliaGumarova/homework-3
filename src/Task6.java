import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Задание № 6");
        Scanner scan = new Scanner(System.in);
        int daysInYear = 0;
        System.out.println("Введите год = ");
        int year = scan.nextInt();
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println("Високосный год");
            daysInYear = 366;
        } else {
            System.out.println("Обычный год");
            daysInYear = 365;
        }
        System.out.println("В " + year + " году " + daysInYear + " дней");
    }
}
