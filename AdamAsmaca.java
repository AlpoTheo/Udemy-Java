import java.util.Scanner;

public class AdamAsmaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"kalem", "kitap", "masa", "bilgisayar", "telefon"}; // Kelime listesi
        String word = words[(int) (Math.random() * words.length)]; // Rastgele bir kelime seç
        String hiddenWord = new String(new char[word.length()]).replace("\0", "_"); // Kelimenin gizli halini oluştur
        int wrongGuesses = 0; // Yanlış tahmin sayısı
        int maxWrongGuesses = 6; // Maksimum yanlış tahmin sayısı

        while (wrongGuesses < maxWrongGuesses && hiddenWord.contains("_")) { // Oyun döngüsü
            System.out.println("Kelime: " + hiddenWord);
            System.out.println("Yanlış tahmin sayisi: " + wrongGuesses + "/" + maxWrongGuesses);
            System.out.print("Harf tahmininiz: ");
            String guess = scanner.next();

            if (word.contains(guess)) { // Tahmin doğruysa
                System.out.println("Tahmin doğru!");
                char[] wordArray = word.toCharArray();
                char[] hiddenWordArray = hiddenWord.toCharArray();
                for (int i = 0; i < word.length(); i++) {
                    if (wordArray[i] == guess.charAt(0)) {
                        hiddenWordArray[i] = guess.charAt(0);
                    }
                }
                hiddenWord = String.valueOf(hiddenWordArray);
            } else { // Tahmin yanlışsa
                System.out.println("Tahmin yanliş.");
                wrongGuesses++;
            }
        }

        if (wrongGuesses == maxWrongGuesses) { // Kaybettiniz
            System.out.println("Kaybettiniz. Doğru kelime: " + word);
        } else { // Kazandınız
            System.out.println("Tebrikler! Doğru kelime: " + word);
        }

        scanner.close();
    }
}