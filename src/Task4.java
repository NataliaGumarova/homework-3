import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        System.out.println("x = ");
        double x = scan.nextDouble();
        System.out.println("y = ");
        double y = scan.nextDouble();
        if (x > 0 && y > 0) {
           System.out.println(" Точка в I четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в IV четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка во II четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в III четверти");
        } else
        {System.out.println("Введите верное значение координат");}
    }
}
