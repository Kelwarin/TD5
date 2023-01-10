package TD5;

public class VoitureFreinFoucault extends VoitureMontee{
    public VoitureFreinFoucault(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return voiture.getAcceleration();
    }

    public int getFreinage() {
        return 1 + voiture.getFreinage();
    }

    public int getMasse() {
        return 2 + voiture.getMasse();
    }

    public int getPrix() {
        return 500 + voiture.getPrix();
    }

    public String toString() {
        return voiture.toString() + ", frein foucault";
    }
}
