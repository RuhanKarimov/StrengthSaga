package StrengthSagaInJava;

import java.util.ArrayList;

public class Kullanici extends Canli implements Hareketler{
    ArrayList<Item> itemler;
    ArrayList<Gorevler> gorevler;
    int userId;
    int sifre;
    int yas;
    int kilo;
    int para;
    int tecrubePuani;
    int mana;
    int[] itemSlotlari;
    String kullaniciAdi;
    String[] elementYatkinligi;

    public Kullanici(){
        super();
        itemler = new ArrayList<>();
        gorevler = new ArrayList<>();
    }

    @Override
    public int saldir(int sal) {
        return 0;
    }

    @Override
    public int savun(int sav) {
        return 0;
    }

    @Override
    public int canAzalt(int can) {
        return 0;
    }

    @Override
    public int ozelYetVur(OzelYetenek yet) {
        return 0;
    }
    int topStat(OzelYetenek yetenek){
        return 0;
    }
    int TPArtirma(int tp){
        return 0;
    }
    int sevKontrol(int tp, int tpMaks){
        return 0;
    }
    int kayitOlma(int sifre, int userId){
        return 0;
    }
    int girisYapma(int sifre, int userId){
        return 0;
    }
}
