package OOPeAraclar;

public class KrediKartStrateji implements OdemeStrateji {

    private String ad;
    private String kartNumara;
    private String cvv;
    private String sonKullanmaTarihi;

    public KrediKartStrateji(String ad, String kartNumara, String cvv, String sonKullanmaTarihi) {
        this.ad = ad;
        this.kartNumara = kartNumara;
        this.cvv = cvv;
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    @Override
    public void odeme(int tutar) {
        System.out.println(tutar + " TL kredi/banka kartı ile ödendi.");
    }

}
