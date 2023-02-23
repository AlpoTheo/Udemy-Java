import java.util.Scanner; // ctrl+shift+ı

public class Kilometrehesaplama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Araciniz kilometre kaç kuruş yakiyor? (Örnek: 0,32): ");
        double kurus = keyboard.nextDouble();

        System.out.println("Aracinizla kaç km yol gittiniz? : ");
        int km = keyboard.nextInt();

        System.out.println("Toplam ödemeniz gereken tutar: "+ (kurus*km) + "tl dir...");
    }
}
