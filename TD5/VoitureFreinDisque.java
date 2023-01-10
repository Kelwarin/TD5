package TD5;

public class VoitureFreinDisque extends VoitureMontee{
    public VoitureFreinDisque(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return voiture.getAcceleration();
    }

    public int getFreinage() {
        return 8 + voiture.getFreinage();
    }

    public int getMasse() {
        return 3 + voiture.getMasse();
    }

    public int getPrix() {
        return 150 + voiture.getPrix();
    }

    public String toString() {
        return voiture.toString() + ", frein disque";
    }
}
