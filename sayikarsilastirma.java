import java.util.Scanner;

public class sayikarsilastirma {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int a = keyboard.nextInt();

        System.out.print("İkinci sayiyi giriniz: ");
        int b = keyboard.nextInt();

        System.out.print("Üçüncü sayiyi giriniz: ");
        int c = keyboard.nextInt();

        int maks = -1;

        if (a>=b && a>=c){
            maks = a;
        }
        else if (b>=a && b>=c){
            maks = b;
        }
        else {
            maks = c;
        }
        System.out.println("Maksimum sayi: "+maks);
    }
}
