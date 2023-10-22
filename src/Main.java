import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        int d = scanner.nextInt();

        switch (d) {
            case 1 -> System.out.printf("+: %f", num + num3);
            case 2 -> System.out.printf("-: %.2f", num - num2);
            case 3 -> System.out.printf("*: %f", num * num3);
            case 1 -> System.out.printf("/: %f", num / num3);
            default -> System.out.println("Error");
        }

        System.out.println();

        if (d == 1) {
            System.out.printf("+: %d", num + num2);
        else if (d == 2)
                System.out.printf("-: %d", num - num2);
            else if (d == 3)
                System.out.printf("*: %d", num * num2);
            else if (d == 4)
                System.out.printf("/: %d", num / num2);
        }
                else{
            System.out.println("Error");
        }

        char k = scanner.next().charAt(0);

        if (k == '+'){
            System.out.printf("+: %d", num+num2);
        }
        scanner.close();
    }
}
