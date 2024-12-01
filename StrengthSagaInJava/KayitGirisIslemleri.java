package StrengthSagaInJava;

public class KayitGirisIslemleri {
    String kullaniciAdi;
    String[] kullaniciAdlari;
    int sifre;

    KayitGirisIslemleri() {}
    int KayitIslemleri(String kullaniciAdi, int sifre) {
        for (String s : kullaniciAdlari) {
            if (s.equals(kullaniciAdi)) {
                System.out.println("Sistemde bu isimde birisi bulunmaktadir.\nLütfen farklı bir kullanici adi deneyeniz.");
            }
        }
        return 0;
    }
}

