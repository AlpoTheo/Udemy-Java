import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("***********************************");
        String islemler = "1. Toplama İşlemi \n"
                         +"2. Çikarma İşlemi \n"
                         +"3. Çarpma İşlemi \n"
                         +"4. Bölme İşlemi \n";
        System.out.println(islemler);
        System.out.println("***********************************");
        System.out.println("İşlemi seçiniz: ");
        String islem = keyboard.nextLine();
        double a;
        double b; 

        switch(islem){
            case "1":
                System.out.println("Birinci Sayi: ");
                a = keyboard.nextInt();
                System.out.println("İkinci Sayi: ");
                b = keyboard.nextInt();
                System.out.println("Sonuç: "+ (a+b));
                break;

            case "2":
                System.out.println("Birinci Sayi: ");
                a = keyboard.nextInt();
                System.out.println("İkinci Sayi: ");
                b = keyboard.nextInt();
                System.out.println("Sonuç: "+ (a-b));
                break;

            case "3":
                System.out.println("Birinci Sayi: ");
                a = keyboard.nextInt();
                System.out.println("İkinci Sayi: ");
                b = keyboard.nextInt();
                System.out.println("Sonuç: "+ (a*b));
                break;

            case "4":
                System.out.println("Birinci Sayi: ");
                a = keyboard.nextInt();
                System.out.println("İkinci Sayi: ");
                b = keyboard.nextInt();
                System.out.println("Sonuç: "+ (a/b));
                break;
            
            default:
                System.out.println("Geçersiz işlem ");
        }
    }
}
