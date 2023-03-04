import java.util.Scanner;

public class Whilefaktoriyel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = keyboard.nextInt();
        int faktoriyel = 1;
        
        while (sayi>0){
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.print("Faktoriyel: "+faktoriyel);
    }
}
