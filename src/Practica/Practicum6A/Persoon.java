package Practica.Practicum6A;

public class Persoon {

    private String naam;
    private double budget;
    private Game mijnGames;

    public Persoon(String nm, double bud) {
        naam = nm;
        budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        return true;
    }

    public boolean verkoop(Game g, Persoon koper) {
        return false;
    }

    public String toString() {
        return "Persoon{" + "naam='" + naam + '\'' + ", budget=" + budget + ", mijnGames=" + mijnGames + '}';
    }
}
