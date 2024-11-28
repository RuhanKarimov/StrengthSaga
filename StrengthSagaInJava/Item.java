package StrengthSagaInJava;

public class Item implements NitelikBelirleme {
    int saglikPuan;
    int salPuan;
    int sayac;
    String ozelYet;
    String[] turler;
    String[] enderlik;

    @Override
    public int rasgeleSecim() {
        return 0;
    }

    @Override
    public int statBelirleme(int sav) {
        return 0;
    }

    int turSec(String[] turler){
        return 0;
    }

    int topStat(OzelYetenek yetenek){
        return 0;
    }
}
