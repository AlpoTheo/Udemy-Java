import java.util.Scanner;

public class BedenKitleIndeksi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Kilonuzu girin: ");
        int kilo = keyboard.nextInt();
        System.out.print("Boyunuzu girin: (Örnek: 1,75) ");
        double boy = keyboard.nextDouble();
        double bki = kilo / (boy * boy);

        System.out.println("Beden kitle indeksiniz: "+ bki);

    }
}
