public class Parametrelimetodlar {
    public static void toplama(int a,int b,int c){
        System.out.println("Toplamlari = "+(a+b+c)); 
    }

    public static void selamlama(String isim){
        System.out.println("Selam "+isim);
    }

    public static void main(String[] args) {
        selamlama("Alp");
        toplama(5, 20, 4);
    }
}
