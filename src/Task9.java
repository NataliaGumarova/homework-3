import java.util.Scanner;
public class Task9 {
    public static void main(String[] args)
    {
        System.out.println("Задание № 9");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты начала отрезка (x1, y1)");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.println("Введите координаты конца отрезка (x2, y2)");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        if (x1==x2 && y1==y2) {
            System.out.println("Точка!");
        } else if (x1 == x2) {
            System.out.println("Вертикальная линия");
        } else {
                double slope = (y2-y1) / (x2-x1);
                if (slope == 0) {
                    System.out.println("отрезок- гор.линия");
                } else if (slope > 0) {
                    System.out.println("подъём");
                } else {
                    System.out.println("спуск");
                }
            }
    }
}
