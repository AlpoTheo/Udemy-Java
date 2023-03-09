public class Metodlardareturn {
    public static int toplama(int a,int b,int c){ //void return döndüremez o yüzden farklı bir tür seçilmelidir.
       // System.out.println(a+b+c);
       return (a+b+c);
    }
    public static void main(String[] args) {
        System.out.println("Çikti değeri: "+toplama(2, 3, 4));
        System.out.println("Sonuç: "+dortilecarp(ikiiletopla(16)));
    }
    public static int ikiilecarp(int a){
        return a*2;
    }
    public static int ikiiletopla(int a){
        return a+2;
    }
    public static int dortilecarp(int a){
        return a*4;
    }
}
