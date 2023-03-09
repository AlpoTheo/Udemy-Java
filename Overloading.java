public class Overloading {
    public static void toplama(String a, String b){
        System.out.println(a+" "+b);
    }
    public static void toplama(int a, int b){
        System.out.println("Toplamlari: "+(a+b));
    }
    public static void toplama(int a, int b, int c){
        System.out.println("Toplamlari: "+(a+b+c));
    }
    public static void skorhesapla(String isim, int puan){
        System.out.println(isim+" adli oyuncunun "+puan+" puani var.");
    }
    public static void skorhesapla(int puan){
        System.out.println("İsimsiz oyuncunun "+puan+" puani var");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim+" adli oyuncunun hiç puani yok");
    }
    public static void main(String[] args) {
        toplama(2, 5, 6);
        toplama(6, 3);
        toplama("Alp", "Doruk");
        skorhesapla("Alp", 1000);
        skorhesapla("Murat");
        skorhesapla(400);
    }
}
