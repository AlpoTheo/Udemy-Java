import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("a kenarini giriniz: ");
        int a = keyboard.nextInt();

        System.out.print("b kenarini giriniz: ");
        int b = keyboard.nextInt();

        double hipotenus;
        hipotenus = (a*a+b*b);
        System.out.println("Hipotenus hesaplanacak kenarin degeri: "+Math.sqrt(hipotenus));
    }
}
