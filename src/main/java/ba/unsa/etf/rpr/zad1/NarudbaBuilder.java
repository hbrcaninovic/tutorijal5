package ba.unsa.etf.rpr.zad1;

public abstract class NarudbaBuilder {

    protected Narudba narudba;

    public Narudba napraviNarudbu()
    {
        narudba=new Narudba();
        uzetiNarudbu();
        odreditiKolicinu();
        naplati();
        return narudba;
    }
    public abstract void uzetiNarudbu();
    public abstract void odreditiKolicinu();
    public abstract void naplati();
}
