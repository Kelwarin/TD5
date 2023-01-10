package TD5;

public class TriFicheVitesse implements Comparable<TriFicheVitesse>{
    private Fiche fiche;

    public TriFicheVitesse(Fiche fiche) {
        this.fiche = fiche;
    }

    public Fiche getFiche() {
        return fiche;
    }

    @Override
    public int compareTo(TriFicheVitesse comparable) {
        return Integer.compare(fiche.getVitesseMax(), comparable.fiche.getVitesseMax());
    }
}
