package OOPeAraclar;

public class eAraclarFactory {

    public static eAraclar getBisikletAraclar(String type, int saat, String tur, int koltukSayisi, String sepetDurum, String pedal, String amortisor, int fiyat) {

        if ("Bisiklet".equalsIgnoreCase(type)) {
            return new Bisiklet(saat, tur, koltukSayisi, sepetDurum, pedal, amortisor, fiyat); //Bisikleti yazmaya gerek var mı ? - Marka seçiminden sonra bitsin mi 
        } else if ("birdB".equalsIgnoreCase(type)) {
            return new birdB(saat, tur, koltukSayisi, sepetDurum, pedal, amortisor, fiyat); // Bilgi ekranı - Kullanıcı oluşturma
        } else if ("martiB".equalsIgnoreCase(type)) {
            return new martiB(saat, tur, koltukSayisi, sepetDurum, pedal, amortisor, fiyat);
        } else if ("mobiB".equalsIgnoreCase(type)) {
            return new mobiB(saat, tur, koltukSayisi, sepetDurum, pedal, amortisor, fiyat);
        }
        return null;

    }

    public static eAraclar getKaykayAraclar(String type, int saat, String tur, String malzeme, int tekerlekSayisi, String stil, int fiyat) {

        if ("Kaykay".equalsIgnoreCase(type)) {
            return new Kaykay(saat, tur, malzeme, tekerlekSayisi, stil, fiyat);
        } else if ("eKayK".equalsIgnoreCase(type)) {
            return new eKayK(saat, tur, malzeme, tekerlekSayisi, stil, fiyat);
        } else if ("hoverboardK".equalsIgnoreCase(type)) {
            return new hoverboardK(saat, tur, malzeme, tekerlekSayisi, stil, fiyat);
        } else if ("biK".equalsIgnoreCase(type)) {
            return new biK(saat, tur, malzeme, tekerlekSayisi, stil, fiyat);
        } else if ("eBoardK".equalsIgnoreCase(type)) {
            return new eBoardK(saat, tur, malzeme, tekerlekSayisi, stil, fiyat);
        }
        return null;
    }

    public static eAraclar getScooterAraclar(String type, int saat, String tur, String taban, String size, String renk, int fiyat) {
        if ("Scooter".equalsIgnoreCase(type)) {
            return new Scooter(saat, tur, taban, size, renk, fiyat);
        } else if ("martiS".equalsIgnoreCase(type)) {
            return new martiS(saat, tur, taban, size, renk, fiyat);
        } else if ("birdS".equalsIgnoreCase(type)) {
            return new birdS(saat, tur, taban, size, renk, fiyat);
        } else if ("mobiS".equalsIgnoreCase(type)) {
            return new mobiS(saat, tur, taban, size, renk, fiyat);
        } else if ("biS".equalsIgnoreCase(type)) {
            return new biS(saat, tur, taban, size, renk, fiyat);
        }
        return null;
    }

}
