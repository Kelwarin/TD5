package TD5;

import java.util.Collection;

public class Fiche {
    private Voiture voiture;
    private int vitesseMax;
    private int distanceFreinage;

    public Fiche(Voiture voiture, int vitesseMax, int distanceFreinage){
        this.voiture = voiture;
        this.vitesseMax = vitesseMax;
        this.distanceFreinage = distanceFreinage;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public int getDistanceFreinage() {
        return distanceFreinage;
    }

    @Override
    public String toString() {
        return voiture + "\nVitesse max : " + vitesseMax + "\nDistance Freinage : " + distanceFreinage + "\n\n";
    }
}
