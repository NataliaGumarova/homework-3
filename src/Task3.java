import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите номер животного из списка\n " +
                "1. Кошка\n " +
                "2. Собака\n " +
                "3. Свинья\n " +
                "4. Петух");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Хрю");
                 break;
            case 4:
                System.out.println("Кукареку");
                break;
            default:
                System.out.println("Введите номер животного из списка");
        }
    }
}
