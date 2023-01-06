package TD5;

public class VoitureFreinDisque extends VoitureMontee{
    public VoitureFreinDisque(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return voiture.getAcceleration();
    }

    public int getFreinage() {
        return 8;
    }

    public int getMasse() {
        return 3;
    }

    public int getPrix() {
        return 150;
    }

    public String toString() {
        return ", frein disque" + super.toString();
    }
}
