package OOPeAraclar;

public class KaykayBilgi implements eAraclarBilgi {

    @Override
    public void eAracBilgiGetir() {
        
        
        System.out.println("Kaykay kategorisinde 4 tane markamız mevcuttur\n");
        System.out.println("Bu markalara göre malzeme türü, tekerlek sayısı, türü(style) seçenekleri markalara göre tanımlanmıştır.\n");
        System.out.println("1- e-KAY:      Malzeme türü: Plastik, Tekerlek sayısı: 4, Türü: Akrobasi");
        System.out.println("2- HOVERBOARD: Malzeme türü: Ahşap,   Tekerlek sayısı: 6, Türü: Seyir");
        System.out.println("3- BI:         Malzeme türü: Ahşap,   Tekerlek sayısı: 4, Türü: Akrobasi");
        System.out.println("4- e-BOARD:    Malzeme türü: Plastik, Tekerlek sayısı: 6, Türü: Seyir\n");
    }

}
