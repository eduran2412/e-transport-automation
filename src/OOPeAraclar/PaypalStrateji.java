package OOPeAraclar;

public class PaypalStrateji implements OdemeStrateji {

    private String emailId;
    private String sifre;

    public PaypalStrateji(String emailId, String sifre) {
        this.emailId = emailId;
        this.sifre = sifre;
    }

    @Override
    public void odeme(int tutar) {
        System.out.println(tutar + " TL Paypal ile ödendi.");
    }

}
