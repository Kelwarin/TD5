package TD5;

public class VoitureMoteurDiesel extends VoitureMontee {
    public VoitureMoteurDiesel(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return 150 + voiture.getAcceleration();
    }

    public int getFreinage() {
        return voiture.getFreinage();
    }

    public int getMasse() {
        return 500 + voiture.getMasse();
    }

    public int getPrix() {
        return voiture.getPrix();
    }

    public String toString() {
        return voiture.toString() + ", moteur diesel";
    }
}
