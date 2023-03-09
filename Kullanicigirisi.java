import java.util.Scanner;

public class Kullanicigirisi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int giris_hakki = 3;
        
        String sys_kullanici_adi = "Alp Doruk";
        String sys_parola = "12345";

        System.out.println("**************************");
        System.out.println("Kullanici girişine hoşgeldiniz...");
        System.out.println("**************************");

        while(true){
            System.out.print("Kullanici Adi: ");
            String kullanici = keyboard.nextLine();
            System.out.print("Parola: ");
            String parola = keyboard.nextLine();

            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz, "+kullanici);
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolaniz yanliş...");
                giris_hakki -= 1;
            }
            else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanici adiniz yanliş...");
                giris_hakki -= 1;
            }
            else {
                System.out.println("Kullanici adiniz ve parolaniz yanliş");
                giris_hakki -= 1;
            }
            if (giris_hakki == 0){
                System.out.println("Giriş hakkiniz bitmiştir lütfen sonra tekrar deneyiniz...");
                break;
            }
}
    }
}
