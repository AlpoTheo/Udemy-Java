import java.util.Scanner;

public class Else_if {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Lütfen notunuzu giriniz: ");
        int not = keyboard.nextInt();

        if (not >= 90){
            System.out.println("AA");
        }
        else if (not >= 85 ){
            System.out.println("BA");
        }
        else if (not >= 80){
            System.out.println("BB");
        }
        else if (not >= 75){
            System.out.println("BC");
        }
        else {
            System.out.println("Kaldin ");
        }
    }
}
