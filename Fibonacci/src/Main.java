import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int num = input.nextInt();
        int a = 0, b = 1;

        if (num <= 0) {
            System.out.println("Geçersiz sayı. Eleman sayısı pozitif bir sayı olmalıdır.");
        } else if (num == 1) {
            System.out.println("Fibonacci serisi: 0");
        } else if (num == 2) {
            System.out.println("Fibonacci serisi: 0 1");
        } else {
            System.out.println("Fibonacci serisi:");
            System.out.print(a + "  ");
            System.out.print(b + "  ");

            for (int i = 2; i < num; i++) {  //0 1 1 2 3 num=5
                int next = a + b;
                System.out.print(next + "  ");
                a = b;
                b = next;

            }
        }
    }
}