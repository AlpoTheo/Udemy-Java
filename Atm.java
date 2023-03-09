import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. İşlem : Bakiye Öğrenme\n"
                          +"2. İşlem : Para Çekme\n"
                          +"3. İşlem : Para Yatirma\n"
                          +"Çikiş için q'ya basiniz";

        System.out.println("*********************************");
        System.out.println(islemler);
        System.out.println("*********************************");

        while(true){
            System.out.print("İşlemi Seçiniz: ");
            String islem = keyboard.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Çikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz : "+bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = keyboard.nextInt();
                keyboard.nextLine();

                if(bakiye - tutar < 0 ){
                    System.out.println("Yeterli Bakiye Yok , Bakiyeniz : "+bakiye);
                }
                else{
                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz: "+bakiye);
                }
            }
            else if(islem.equals("3")){
                System.out.println("Yatirmak istediğiniz tutar: ");
                int tutar = keyboard.nextInt();
                keyboard.nextLine();

                bakiye +=tutar;
                System.out.println("Yeni Bakiyeniz: "+bakiye);
                
                
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }

    }
}
