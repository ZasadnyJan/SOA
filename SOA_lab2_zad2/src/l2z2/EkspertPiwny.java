package l2z2;

public class EkspertPiwny {
    public String kolor;
    public String marka;

    public EkspertPiwny(String kolor){
        this.kolor=kolor;
        if(kolor.equals("Bursztynowy")){
            this.marka="Perła";
        }
        if(kolor.equals("Żółty")){
            this.marka="Corona";
        }
        if(kolor.equals("Zielony")){
            this.marka="Sommersby";
        }
    }

    public String decyzja(){
        return marka;
    }
}
