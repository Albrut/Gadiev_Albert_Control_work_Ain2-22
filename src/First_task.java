import java.util.Scanner;
public class First_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону треугольника ");
        var leg = scanner.nextInt();
        System.out.println("Периметр треугольника равен " + leg*3 + "\nПлощадь треуголька равна "+(int)Math.round(leg*leg*Math.sqrt(3)/4));

    }
}
