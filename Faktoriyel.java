import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int faktoriyel = 1;

        int sayi = keyboard.nextInt();

        for (int i = 1; i<=sayi; i++){
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel = "+ faktoriyel);
    }
}
