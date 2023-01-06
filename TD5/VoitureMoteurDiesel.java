package TD5;

public class VoitureMoteurDiesel extends VoitureMontee {
    public VoitureMoteurDiesel(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return 150;
    }

    public int getFreinage() {
        return voiture.getFreinage();
    }

    public int getMasse() {
        return 500;
    }

    public int getPrix() {
        return voiture.getAcceleration();
    }

    public String toString() {
        return ", moteur diesel" + super.toString();
    }
}
