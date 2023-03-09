import java.util.Scanner;

public class Ebob {
    public static int ebobBulma(int sayi1,int sayi2){
        int ebob = 1;

        for(int i = 1; i <= sayi1 && i <= sayi2;i++){
            if((sayi1 % i == 0) && (sayi2 % i == 0)){
                ebob = i;
            }
        }
    return ebob;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Birinci Sayi:  ");
        int birinci_sayi = keyboard.nextInt();

        System.out.print("İkinci Sayi: ");
        int ikinci_sayi = keyboard.nextInt();
        System.out.println("İki sayinin ebobu: "+ebobBulma(birinci_sayi, ikinci_sayi));
    }
}
