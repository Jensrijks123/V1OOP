package Practica.Practicum4B;

public class AutoHuur {

    private int aantalDagen;
    private Klant huurder;
    private Auto geHuurdeAuto;



    public AutoHuur(){}

    public void setAantalDagen(int aD) { aantalDagen = aD; }

    public int getAantalDagen() { return aantalDagen; }

    public void setGehuurdeAuto(Auto gA) { geHuurdeAuto = gA; }

    public Auto getGehuurdeAuto() { return geHuurdeAuto; }

    public void setHuurder(Klant k) { huurder = k; }

    public Klant getHuurder() { return huurder; }

    public double totaalPrijs() {
        double d = 0;

        if(geHuurdeAuto == null) {
            d = d + 0.0;
        }
        else if (huurder.getKorting() == 0.0){
            d = d + geHuurdeAuto.getPrijsPerDag() * aantalDagen;
        }

        else {
            double s = (d + geHuurdeAuto.getPrijsPerDag()) * aantalDagen; // Prijs zonder korting
            d = (s - ((huurder.getKorting()) / 100) * ((d + geHuurdeAuto.getPrijsPerDag()) * aantalDagen)); // Totaal prijs
        }



        return d;
    }

    public String toString() {
        String s = "";

        if (geHuurdeAuto == null) {
            s = s + "  er is geen auto bekend \n";
        }
        else {
            s = s + "  autotype: " +geHuurdeAuto.toString() + "\n";
        }

        if (huurder == null) {
            s = s + "  er is geen huurder bekend \n";
        }
        else {
            s = s + huurder.toString();
        }

        s = s + "  aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();

        return s;
    }
}
