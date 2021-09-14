package OOPeAraclar;

import OOPeAraclar.eAraclar;

public class Scooter extends eAraclar {

    private int saat;
    private String tur;
    private String taban;
    private String size;
    private String renk;
    private int fiyat;

    public Scooter() {
    }

    public Scooter(int saat, String tur, String taban, String size, String renk, int fiyat) {
        this.saat = saat;
        this.tur = tur;
        this.taban = taban;
        this.size = size;
        this.renk = renk;
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

    public String getTaban() {
        return taban;
    }

    public void setTaban(String taban) {
        this.taban = taban;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Scooter{" + "saat=" + saat + ", tur=" + tur + ", taban=" + taban + ", size=" + size + ", renk=" + renk + '}';
    }

    @Override
    public int getFiyat() {
        return fiyat;
    }

}
