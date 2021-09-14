package OOPeAraclar;

public class BilgiMaker {

    private eAraclarBilgi bisikletBilgi;
    private eAraclarBilgi scooterBilgi;
    private eAraclarBilgi kaykayBilgi;

    public BilgiMaker() {
        
        
        bisikletBilgi = new BisikletBilgi();
        scooterBilgi = new ScooterBilgi();
        kaykayBilgi = new KaykayBilgi();

    }

    public void bilgiBisiklet() {
        bisikletBilgi.eAracBilgiGetir();

    }

    public void bilgiScooter() {
        scooterBilgi.eAracBilgiGetir();

    }

    public void bilgiKaykay() {
        kaykayBilgi.eAracBilgiGetir();
        
    }

}
