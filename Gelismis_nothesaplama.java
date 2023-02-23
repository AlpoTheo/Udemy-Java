import java.util.Scanner;

public class Gelismis_nothesaplama {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Vize 1: ");
        int vize1 = keyboard.nextInt();
        System.out.print("Vize 2: ");
        int vize2 = keyboard.nextInt();
        System.out.print("Final: ");
        int finalnot = keyboard.nextInt();

        System.out.print("Okul Ortalamaniz: ");
        double ortalama = keyboard.nextDouble();

        double toplamnot = (vize1 * 3 / 10.0 ) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);

        if (toplamnot>=90){
            System.out.println("AA aldiniz...");
        }
        else if (toplamnot>=85){
            System.out.println("BA aldiniz");
        }
        else if (toplamnot>=80){
            System.out.println("BB aldiniz");
        }
        else if (toplamnot>=75){
            System.out.println("CB aldiniz");
        }
        else if (toplamnot>=70){
            System.out.println("CC aldiniz");
        }
        else if (toplamnot>=65){
            System.out.println("DC aldiniz");
        }
        else if (toplamnot>=60){
            System.out.println("DD aldiniz...");
            if ((double)ortalama < 2.50){
                System.out.println(" DD aldiniz not ortalamaniz düşük dersi tekrardan almayi düşünebilirsiniz.");
            }
        }
        else {
            System.out.println("Kaldiniz");
        }
    }
}
