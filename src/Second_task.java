import java.util.Random;
import java.util.Scanner;



public class Second_task {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        var g_digit = random.nextInt((10 - (-10)) + 1) + (-10);
        System.out.println("Сгенерированое число" + " " +g_digit);
        if (g_digit < 0){
            g_digit *= (-1);

        }
        System.out.println(g_digit);
    }
}
