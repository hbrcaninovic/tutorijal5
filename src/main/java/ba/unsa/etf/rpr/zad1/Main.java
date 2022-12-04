package ba.unsa.etf.rpr.zad1;

public class Main {

    public static void main(String[] args) {
        NarudbaBuilder narudba1=new ObrokBuilder();
        Narudba narudba=narudba1.napraviNarudbu();
        System.out.println(narudba);

        NarudbaBuilder narudba2=new PiceBuilder();
        narudba=narudba2.napraviNarudbu();
        System.out.println(narudba);
    }
}
