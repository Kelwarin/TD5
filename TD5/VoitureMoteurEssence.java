package TD5;

public class VoitureMoteurEssence extends VoitureMontee {
    public VoitureMoteurEssence(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return 115 + voiture.getAcceleration();
    }

    public int getFreinage() {
        return voiture.getFreinage();
    }

    public int getMasse() {
        return 300 + voiture.getMasse();
    }

    public int getPrix() {
        return voiture.getPrix();
    }

    public String toString() {
        return voiture.toString() + ", moteur à essence";
    }
}
