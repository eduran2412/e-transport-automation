
package OOPeAraclar;


public class Kullanici {
    
    private int id;
    private String adi;
    private String soyadi;
    private int bakiye;

    public Kullanici() {
    }

    public Kullanici(int id, String adi, String soyadi, int bakiye) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.bakiye = bakiye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    
}
