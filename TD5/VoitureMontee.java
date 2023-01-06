package TD5;

public abstract class VoitureMontee implements Voiture{
    protected Voiture voiture;

    public VoitureMontee(Voiture voiture){
        this.voiture = voiture;
    }

    public String toString() {
        return voiture.toString();
    }
}
