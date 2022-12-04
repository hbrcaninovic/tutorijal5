package ba.unsa.etf.rpr.zad1;

public class ObrokBuilder extends NarudbaBuilder {

    @Override
    public void uzetiNarudbu() {
        narudba.setNaziv("Snack package");
    }

    @Override
    public void odreditiKolicinu() {
        narudba.setKolicina(3);
    }

    @Override
    public void naplati() {
        narudba.setCijena(12.5);

    }
}
