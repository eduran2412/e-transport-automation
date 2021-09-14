package OOPeAraclar;

import OOPeAraclar.eAraclar;

public class Bisiklet extends eAraclar {

    private int saat;
    private String tur;
    private int koltukSayisi;
    private String sepetDurum;
    private String pedal;
    private String amortisor;
    private int fiyat;

    public Bisiklet() {

    }

    public Bisiklet(int saat, String tur, int koltukSayisi, String sepetDurum, String pedal, String amortisor, int fiyat) {
        this.saat = saat;
        this.tur = tur;
        this.koltukSayisi = koltukSayisi;
        this.sepetDurum = sepetDurum;
        this.pedal = pedal;
        this.amortisor = amortisor;
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

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

    public void setKoltukSayisi(int koltukSayisi) {
        this.koltukSayisi = koltukSayisi;
    }

    public String getSepetDurum() {
        return sepetDurum;
    }

    public void setSepetDurum(String sepetDurum) {
        this.sepetDurum = sepetDurum;
    }

    public String getPedal() {
        return pedal;
    }

    public void setPedal(String pedal) {
        this.pedal = pedal;
    }

    public String getAmortisor() {
        return amortisor;
    }

    public void setAmortisor(String amortisor) {
        this.amortisor = amortisor;
    }

    @Override
    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Bisiklet{" + "saat=" + saat + ", tur=" + tur + ", koltukSayisi=" + koltukSayisi + ", sepetDurum=" + sepetDurum + ", pedal=" + pedal + ", amortisor=" + amortisor + '}';
    }

}
