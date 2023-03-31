import java.util.Scanner;

public class Third_task {
    public static void main(String[] args) {
        System.out.println("Введите a b и c");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double root1 = 0, root2 = 0;
        int numRoots = 0;

        for (int x = -1000; x <= 1000; x += 1) {
            int y =  (a*x*x + b*x + c);
            if (y == 0) {
                if (numRoots == 0) {
                    root1 = x;
                    numRoots++;
                } else {
                    root2 = x;
                    numRoots++;
                }
            }
        }

        if (numRoots == 0) {
            System.out.println("Действительных корней нет");
        } else if (numRoots == 1) {
            System.out.println("Уравнение имеет лишь 1 корень: " + root1);
        } else {
            System.out.println("Решение имеет 2 корня " + root1 + " и " + root2);
        }
    }
}