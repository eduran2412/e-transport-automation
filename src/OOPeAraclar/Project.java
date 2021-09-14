package OOPeAraclar;

import java.util.Scanner;

public class Project {

    public static void main(String[] args) {

        KrediKartStrateji krediKarti = null;
        PaypalStrateji paypal = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>> |eAraç Kiralama Programına Hoşgeldiniz| <<<<<<<<<<<<<<<<<<<< \n");

        Kullanici kullanici = new Kullanici();
        System.out.print("Kullanıcı id giriniz: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        kullanici.setId(x);
        System.out.print("Kullanıcı adınızı ve soyadınızı giriniz: ");
        String name = scanner.nextLine();
        kullanici.setAdi(name);
        //kullanici.setSoyadi("Yıldırım");
        // kullanici.setBakiye(250);

        Sepet sepet = new Sepet();

        //sepet.kiralananAraclariGetir();
        //menuGoster();
        while (true) {

            String islemler = "             Ana Menü İşlemleri \n"
                    + "--> Araçlar hakkında bilgi almak için 0(sıfır)'a basınız.\n"
                    + "--> Bisiklet Kiralamak için 1'e basınız.\n"
                    + "--> Scooter Kiralamak için 2'ye basınız. \n"
                    + "--> Kaykay Kiralamak için 3'e basınız.\n"
                    + "--> Çıkış için q'ya basınız.";
            System.out.println("*************************************");
            System.out.println(islemler);
            System.out.println("*************************************\n");

            System.out.print("Ödeme Yöntemi Seçiniz 8- Kredi Kartı 9-Paypal: ");
            String odemeTipi = scanner.nextLine();
            if (odemeTipi.equals("8")) {
                krediKarti = new KrediKartStrateji("Hediye Yıldırım", "00000000000", "345", "08/24");
            } else if (odemeTipi.equals("9")) {
                paypal = new PaypalStrateji("hediye@gmail.com", "123"); 
            }

            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Kiralama Programından çıkılıyor...");
                break;

            } else if (islem.equals("0")) {

                BilgiMaker bilgiMaker = new BilgiMaker();

                while (true) {

                    bilgiMaker.bilgiBisiklet();
                    bilgiMaker.bilgiScooter();
                    bilgiMaker.bilgiKaykay();

                    System.out.print("Ana Menüye dönmek için q'ya basınız: ");
                    String m_islem = scanner.nextLine();
                    System.out.println("----------->>");

                    if (m_islem.equals("q")) {
                        System.out.println("Bilgi ekranından çıkılıyor.");
                        break;
                    }
                }

            } else if (islem.equals("1")) {
                System.out.print("Bisikleti kaç saat kiralayacaksınız: ");
                int saatBilgisi = scanner.nextInt();
                scanner.nextLine();

                System.out.println("----------->");
                System.out.println("Bisiklet markasını seçiniz.\n");
                String marka_islem = " Hangi Markayı Seçmek İstiyorsunuz\n"
                        + "  -> Martı için 1'e basınız.\n"
                        + "  -> Bird için 2'ye basınız.\n"
                        + "  -> Mobi için 3'e basınız.\n"
                        + "  -> Çıkış için q'ya basınız.";

                System.out.println(marka_islem);
                System.out.println("----------->");
                while (true) {
                    System.out.print("Bisiklet markası için işlem seçiniz: ");
                    String m_islem = scanner.nextLine();
                    System.out.println("----------->>");

                    if (m_islem.equals("q")) {
                        System.out.println("Bisiklet Seçiminden Çıkılıyor");
                        break;

                    } else if (m_islem.equals("1")) {
                        System.out.println("Martı seçildi.");
                        eAraclar marti = eAraclarFactory.getBisikletAraclar("martiB", saatBilgisi, "Marti", 2, "var", "metal", "tek", 3);
                        sepet.addItem(marti);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }

                        System.out.println(marti + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("2")) {

                        System.out.println("Marka Bird seçildi.");
                        eAraclar bird = eAraclarFactory.getBisikletAraclar("birdB", saatBilgisi, "Bird", 1, "yok", "plastik", "cift", 5);
                        sepet.addItem(bird);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }

                        System.out.println(bird + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("3")) {
                        System.out.println("Marka Mobi seçildi.");
                        eAraclar mobi = eAraclarFactory.getBisikletAraclar("mobiB", saatBilgisi, "Mobi", 2, "var", "plastik", "cift", 7);
                        sepet.addItem(mobi);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(mobi + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else {
                        System.out.println("Geçersiz marka seçim işlemi...");
                    }
                }

            } else if (islem.equals("2")) {
                System.out.print("Scooter'ı kaç saat kiralayacaksınız: ");
                int saatBilgisi = scanner.nextInt();
                scanner.nextLine();

                System.out.println("----------->");
                System.out.println("Scooter markasını seçiniz.\n");
                String marka_islem = " Hangi Markayı Seçmek İstiyorsunuz\n"
                        + "  -> Martı için 1'e basınız.\n"
                        + "  -> Bird için 2'ye basınız.\n"
                        + "  -> Mobi için 3'e basınız.\n"
                        + "  -> Bi için 4'e basınız.\n"
                        + "  -> Çıkış için q'ya basınız.";

                System.out.println(marka_islem);
                System.out.println("----------->");
                while (true) {
                    System.out.print("Scooter markası için işlem seçiniz: ");
                    String m_islem = scanner.nextLine();
                    System.out.println("----------->>");

                    if (m_islem.equals("q")) {
                        System.out.println("Scooter Seçiminden Çıkılıyor");
                        break;

                    } else if (m_islem.equals("1")) {

                        System.out.println("Martı seçildi.");
                        eAraclar marti = eAraclarFactory.getScooterAraclar("martiS", saatBilgisi, "Martı", "kaucuk", "M", "Yesil", 5);
                        sepet.addItem(marti);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(marti + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("2")) {

                        System.out.println("Marka Bird seçildi.");
                        eAraclar bird = eAraclarFactory.getScooterAraclar("birdS", saatBilgisi, "Bird", "demir", "XXL", "Mavi", 3);
                        sepet.addItem(bird);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(bird + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("3")) {
                        System.out.println("Marka Mobi seçildi.");
                        eAraclar mobi = eAraclarFactory.getScooterAraclar("mobiS", saatBilgisi, "Mobi", "demir", "M", "Turuncu", 4);
                        sepet.addItem(mobi);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(mobi + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("4")) {
                        System.out.println("Marka Bi seçildi.");
                        eAraclar bi = eAraclarFactory.getScooterAraclar("biS", saatBilgisi, "Bi", "kaucuk", "XXL", "Mor", 3);
                        sepet.addItem(bi);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(bi + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else {
                        System.out.println("Geçersiz marka seçim işlemi...");
                    }

                }

            } else if (islem.equals("3")) {
                System.out.print("Kaykay'ı kaç saat kiralayacaksınız: ");
                int saatBilgisi = scanner.nextInt();
                scanner.nextLine();

                System.out.println("----------->");

                System.out.println("Kaykay markasını seçiniz.\n");
                String marka_islem = " Hangi markayı seçmek istiyorsunuz\n"
                        + "  -> eKay için 1'e basınız.\n"
                        + "  -> Hoverboard için 2'ye basınız.\n"
                        + "  -> Bi için 3'e basınız.\n"
                        + "  -> eBoard için 4'e basınız.\n"
                        + "  -> Çıkış için q'ya basınız.";

                System.out.println(marka_islem);
                System.out.println("----------->");

                while (true) {
                    System.out.print("Kaykay markası için işlem seçiniz:");
                    String m_islem = scanner.nextLine();
                    System.out.println("----------->>");

                    if (m_islem.equals("q")) {
                        System.out.println("Kaykay seçiminden çıkılıyor...");
                        break;
                    } else if (m_islem.equals("1")) {
                        System.out.println("eKay seçildi.");
                        eAraclar eKay = eAraclarFactory.getKaykayAraclar("eKayK", saatBilgisi, "eKay", "plastik", 4, "Akrobasi", 3);
                        sepet.addItem(eKay);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(eKay + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("2")) {
                        System.out.println("Hoverboard seçildi.");
                        eAraclar hoverboard = eAraclarFactory.getKaykayAraclar("hoverboardK", saatBilgisi, "Hoverboard", "ahsap", 6, "Seyir", 4);
                        sepet.addItem(hoverboard);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(hoverboard + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("3")) {
                        System.out.println("Bi seçildi.");
                        eAraclar bi = eAraclarFactory.getKaykayAraclar("biK", saatBilgisi, "Bi", "ahsap", 4, "Akrobasi", 5);
                        sepet.addItem(bi);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(bi + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else if (m_islem.equals("4")) {
                        System.out.println("eBoard seçildi.");
                        eAraclar eboard = eAraclarFactory.getKaykayAraclar("eBoardK", saatBilgisi, "eBoard", "plastik", 6, "Seyir", 6);
                        sepet.addItem(eboard);
                        if (odemeTipi.equals("8")) {
                            sepet.odeme(krediKarti, saatBilgisi);
                        } else if (odemeTipi.equals("9")) {
                            sepet.odeme(paypal, saatBilgisi);
                        }
                        System.out.println(eboard + " " + kullanici.getAdi() + " adlı Kullanıcıya " + saatBilgisi + " saat kiralandi.");
                        break;

                    } else {
                        System.out.println("Geçersiz marka seçim işlemi...");
                    }

                }

            } else {
                System.out.println("Geçersiz araç seçim işlemi...");
            }

            //break;  
        }

    }

    /*
    -- Menü Gösterme.
    private static void menuGoster(){
        String islemler = "İşlemler... \n"
                + "--> Bisiklet Kiralamak için 1'e basınız.\n"
                + "--> Scooter Kiralamak için 2'ye basınız. \n"
                + "--> Kaykay Kiralamak için 3'e basınız.\n"
                + "--> Çıkış için q'ya basınız.";
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");
    }
     */
}
