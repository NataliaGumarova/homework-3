import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scan.nextInt();
        System.out.println("Введите второе число");
        int y = scan.nextInt();
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("Yes");
        } else if (x % 2 != 0 && y % 2 != 0 ) {
            System.out.println("Yes");
        }
    }
}
