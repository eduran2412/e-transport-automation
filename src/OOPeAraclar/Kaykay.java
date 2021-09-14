package OOPeAraclar;

import OOPeAraclar.eAraclar;

public class Kaykay extends eAraclar {

    private int saat;
    private String tur;
    private String malzeme;
    private int tekerlekSayisi;
    private String stil;
    private int fiyat;

    public Kaykay() {
    }

    public Kaykay(int saat, String tur, String malzeme, int tekerlekSayisi, String stil,int fiyat) {
        this.saat = saat;
        this.tur = tur;
        this.malzeme = malzeme;
        this.tekerlekSayisi = tekerlekSayisi;
        this.stil = stil;
        this.fiyat = fiyat;
    }

    public int getSAAT() {
        return saat;
    }

    public void setSAAT(int saat) {
        this.saat = saat;
    }

    public String getTUR() {
        return tur;
    }

    public void setTUR(String tur) {
        this.tur = tur;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public int getTekerlekSayisi() {
        return tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public String getStil() {
        return stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }

    @Override
    public String toString() {
        return "Kaykay{" + "saat=" + saat + ", tur=" + tur + ", malzeme=" + malzeme + ", tekerlekSayisi=" + tekerlekSayisi + ", stil=" + stil + '}';
    }

    @Override
    public int getFiyat() {
        return fiyat;
    }


}
