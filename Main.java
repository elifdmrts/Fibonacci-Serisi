import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi kac eleman icerecek: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            if (n == 0) {
                System.out.println("Fibonacci serisi: ");
            } else if (n == 1) {
                System.out.println("Fibonacci serisi: 0");
            } else {
                System.out.print("Fibonacci serisi: 0, 1");
                int a = 0;
                int b = 1;

                for (int i = 2; i < n; i++) {
                    int next = a + b;
                    System.out.print(", " + next);
                    a = b;
                    b = next;
                }

                System.out.println();
            }
        }
    }
}