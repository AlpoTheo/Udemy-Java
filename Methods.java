import java.util.Scanner;

public class Methods{
    public static void selamlama(){
        System.out.println("Merhaba Nasilsiniz ?");
        System.out.println("Selamlar");
    }
    public static void faktoriyel (){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Faktoriyel almak istediğiniz değeri giriniz: ");
        int sayi = keyboard.nextInt();

        int faktoriyel = 1;
        while(sayi > 0){
            faktoriyel *= sayi;

            sayi--;
        }
        System.out.println("Faktoriyel: "+faktoriyel);
    }
    public static void main(String[] args) {
        selamlama();
        faktoriyel();   
    }
}