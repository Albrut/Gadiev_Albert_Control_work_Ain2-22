import java.util.Scanner;

public class Fourth_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, затем подстроку которую нужно заменить, после строку на которую нужно заменить");
        var a = scanner.nextLine();
        var b = scanner.nextLine();
        var c = scanner.nextLine();
        var isContain = a.contains(b);
        if (isContain){
            System.out.println(a.replace(b,c));
        }else {
            System.out.println("Такого сабстринга нет");
        }


    }
}
