import java.util.Scanner;

public class Ikisayinindegeri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int birinci_sayi;
        int ikinci_sayi;

        System.out.print("Birinci sayi: ");
        birinci_sayi = keyboard.nextInt();

        System.out.print("İkinci sayi: ");
        ikinci_sayi = keyboard.nextInt();
        System.out.println("Değiştirilmeden önce.....");
        System.out.println("Birinci sayi: "+birinci_sayi+" Ikinci sayi: "+ikinci_sayi);

        
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        System.out.println("Değiştirildikten sonra.....");
        System.out.println("Birinci sayi: "+birinci_sayi+" Ikinci sayi: "+ikinci_sayi);
    }
}
