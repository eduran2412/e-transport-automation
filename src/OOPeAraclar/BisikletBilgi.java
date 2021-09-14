package OOPeAraclar;

public class BisikletBilgi implements eAraclarBilgi {

    @Override
    public void eAracBilgiGetir() {
        
        
        System.out.println("\n***************** e-Araçlar Bilgi Sayfası *****************\n");
        System.out.println("Bisiklet kategorisinde 3 tane markamız mevcuttur. \n");
        System.out.println("Bu markalara göre koltuk sayısı, pedal çeşiti, amortisor çeşiti, sepet durumu seçenekleri markalara göre tanımlanmıştır.\n");
        System.out.println("1- MARTI: Koltuk sayısı: 2, Pedal türü: Metal,   Amortisor türü: Tek,  Sepet durumu: Var ");
        System.out.println("2- BIRD:  Koltuk sayısı: 1, Pedal türü: Plastik, Amortisor türü: Cift, Sepet durumu: Yok ");
        System.out.println("3- MOBI:  Koltuk sayısı: 2, Pedal türü: Plastik, Amortisor türü: Cift, Sepet durumu: Var \n");
        
        System.out.println(">>>>>>>>>>>>>>>>\n");
    }

}
