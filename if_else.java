import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = keyboard.nextInt();

        if (sayi<0){
            System.out.println("Negatif");
        }
        else{
            System.out.println("Pozitif veya 0");
        }

    }
}
