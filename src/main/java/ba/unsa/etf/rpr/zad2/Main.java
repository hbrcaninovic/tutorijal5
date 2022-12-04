package ba.unsa.etf.rpr.zad2;

public class Main {

    public static void main(String[] args) {

        Vozilo auto=FabrikaVozila.kreirajVozilo(FabrikaVozila.AUTOMOBIL);
        auto.dajVozilo();

        Vozilo kamion=FabrikaVozila.kreirajVozilo(FabrikaVozila.KAMION);
        kamion.dajVozilo();

        if(auto instanceof Automobil)
            System.out.println("auto je objekat klase Automobil");
    }
}
