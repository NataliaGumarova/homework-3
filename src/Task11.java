import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите a");
        double a = scan.nextDouble();
        System.out.println("Введите b");
        double b = scan.nextDouble();
        System.out.println("Введите c");
        double c = scan.nextDouble();
        double dis = b * b - 4 * a * c;
        if (dis > 0) {
            System.out.println("x1 = " + ((-b+Math.sqrt(dis))/(2*a)) + " x2 = " + ((-b-Math.sqrt(dis))/(2*a)));
        } else if (dis == 0) {
            System.out.println("x1 = x2 = " + (-b / (2 * a)));
        } else System.out.println("Корней нет");
    }
}
