package Practica.practicum2A;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;
    private Double inhoud;

    public Zwembad(Double bd, Double lg, Double dp) {
        breedte = bd;
        lengte = lg;
        diepte = dp;
    }

    public Zwembad() {

    }

    public Double getBreedte() {
        return breedte;
    }

    public Double getLengte() {
        return lengte;
    }

    public Double getDiepte() {
        return diepte;
    }

    public void setBreedte(Double nwBrd) {
        breedte = nwBrd;
    }

    public void setLengte(Double nwLng) {
        lengte = nwLng;
    }

    public void setDiepte(Double nwDip) {
        diepte = nwDip;
    }

    public String toString() {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
        return s;
    }

    public Double inhoud() {
        Double s = breedte * lengte * diepte;
        return s;
    }

}
