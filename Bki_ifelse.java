import java.util.Scanner;

public class Bki_ifelse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Kilonuzu girin: ");
        int kilo = keyboard.nextInt();
        System.out.print("Boyunuzu girin: (Örnek: 1,75) ");
        double boy = keyboard.nextDouble();
        double bki = kilo / (boy * boy);

        System.out.println("Beden kitle indeksiniz: "+ bki);

        if(bki<18.5){
            System.out.println("Zayif");
        }
        else if(bki>=18.5 && bki<25){
            System.out.println("Normal");
        }
        else if(bki>25 && bki<30){
            System.out.println("Fazla kilolu");
        }
        else {
            System.out.println("Obez");
        }
    }
}
