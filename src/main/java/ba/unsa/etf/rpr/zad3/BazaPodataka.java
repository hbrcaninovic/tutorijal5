package ba.unsa.etf.rpr.zad3;

import java.io.Serializable;

/**
 * Klasa Singleton simulora konekciju na bazu podataka*/
public class BazaPodataka implements Serializable {

    transient public static final BazaPodataka INSTANCE = new BazaPodataka();

    private BazaPodataka(){}

    public void uspostaviKonekciju()
    {
        System.out.println("Uspjesno uspostavljena konekcija sa bazom podataka.");
    }

    private Object dajKonekciju()
    {
        return INSTANCE;
    }

    public static void main(String[] args) {
        BazaPodataka.INSTANCE.uspostaviKonekciju();
    }


}
