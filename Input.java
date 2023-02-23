import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz");
        int yas = keyboard.nextInt();
        System.out.println(yas);
        keyboard.nextLine(); // Dummy salakça input

        System.out.println("Lütfen bir yazi giriniz");
        String yazi = keyboard.nextLine();
        System.out.println(yazi);

        if (keyboard.hasNextInt()){
            int sayi = keyboard.nextInt();
            System.out.println("Sayi: " + sayi);
        } else{
            System.out.println("Lütfen bir sayi giriniz");
        }
    }
}
