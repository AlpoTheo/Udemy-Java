import java.util.Scanner;

public class rakamlartoplami {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = keyboard.nextInt();
        int toplam = 0;

        do {
            toplam += sayi % 10;
            sayi /= 10;
        } while (sayi>0);

        System.out.println("Rakamlari Toplami = "+toplam);
        
    }
}
