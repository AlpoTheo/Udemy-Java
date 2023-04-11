package Arabam;

public class Araba {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return this.model;
    }
    public void setKapilar(int kapilar){
        if (kapilar < 0) {
            System. out.println ("Kapi sayisi O'dan küçük olamaz.");
        }
       else {
           this.kapilar = kapilar;
       }
    }


    
}
