import java.text.BreakIterator;
import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int islem = keyboard.nextInt();

        switch(islem){
            case 1:
                System.out.println("1.işlem");
                break;
            case 2:
                System.out.println("2. işlem");
                break;
            case 3:
                System.out.println("3.işlem");
                break;
            case 4:
                System.out.println("4. işlem");
                break;
            default:
                System.out.println("Geçersiz işlem...");
                break;
        }
    }
}
