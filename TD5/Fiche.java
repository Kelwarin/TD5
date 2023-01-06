package TD5;

import java.util.Collection;

public class Fiche {
    private int vitesseMax;
    private int distanceFreinage;

    public Fiche(int vitesseMax, int distanceFreinage){
        this.vitesseMax = vitesseMax;
        this.distanceFreinage = distanceFreinage;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public int getDistanceFreinage() {
        return distanceFreinage;
    }
}
