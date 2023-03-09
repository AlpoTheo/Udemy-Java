import java.util.Scanner;

public class Faiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bankamiza Hoşgeldiniz. Faiz Orani %6 ");

        int anapara, vade;
        System.out.print("Yatirmak istediğiniz tutar: ");
        anapara = keyboard.nextInt();
        System.out.print("Paranizi kaç yil vadeli yatirmak istiyorsunuz: ");
        vade = keyboard.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;

        for(int i = 1; i <= vade ; i++){
            toplampara = ((toplampara*faizOrani)+toplampara);
            System.out.println(i+". yilin sonunda toplam para:  " +toplampara);
        }
    }
}
