package OOPeAraclar;

import java.util.ArrayList;
import java.util.List;

public class Sepet {

    List<eAraclar> items;

    public Sepet() {
        this.items = new ArrayList<eAraclar>();
    }

    public void addItem(eAraclar item) {
        this.items.add(item);
    }

    public void removeItem(eAraclar item) {
        this.items.remove(item);
    }

    public int calculateTotal(int saat) {

        int sum = 0;

        for (eAraclar item : items) {
            sum = (item.getFiyat() * saat);
        }
        return sum;
    }

    public void odeme(OdemeStrateji paymentMethod, int saat) {
        int tutar = calculateTotal(saat);
        paymentMethod.odeme(tutar);
    }

    void kiralananAraclariGetir() {
        for (eAraclar eAraclar1 : items) {
            System.out.println(eAraclar1.getFiyat());
        }
    }

}
