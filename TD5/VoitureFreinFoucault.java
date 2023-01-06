package TD5;

public class VoitureFreinFoucault extends VoitureMontee{
    public VoitureFreinFoucault(Voiture voiture) {
        super(voiture);
    }

    public int getAcceleration() {
        return voiture.getAcceleration();
    }

    public int getFreinage() {
        return 1;
    }

    public int getMasse() {
        return 2;
    }

    public int getPrix() {
        return 500;
    }

    public String toString() {
        return ", frein foucault" + super.toString();
    }
}
