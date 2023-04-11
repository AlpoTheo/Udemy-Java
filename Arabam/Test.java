package Arabam;

public class Test {
    public static void main(String[] args) {
         Araba araba1 = new Araba();
        // araba1.renk = "Kirmizi";
        // araba1.kapilar = 4;
        // araba1.tekerlekler = 4;
        // araba1.motor = "16V";
        // araba1.model = "Renault";

        // System.out.println(araba1.motor);

        araba1.setModel("Renault");
        System.out.println("Arabanin modeli: "+araba1.getModel());
        araba1.setKapilar(-4);

        Araba araba3 = null;
        // araba3.setModel("Ford");

    }
}
