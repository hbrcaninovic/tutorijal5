package ba.unsa.etf.rpr.zad1;

public class PiceBuilder extends NarudbaBuilder {

    @Override
    public void uzetiNarudbu() {
        narudba.setNaziv("Bubble juicy");
    }

    @Override
    public void odreditiKolicinu() {
        narudba.setKolicina(3);
    }

    @Override
    public void naplati() {
        narudba.setCijena(9);
    }
}
