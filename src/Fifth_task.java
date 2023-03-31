import java.util.Scanner;

public class Fifth_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        var s = scanner.nextLine();
        String[] word = s.split(" ");
        String longword = " ";
        for (String value : word) {
            if (longword.length() < value.length()) {
                longword = value;
            }
        }
        System.out.println(longword);
    }

}
