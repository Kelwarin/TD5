package TD5;

public class TriFicheVitesse implements Comparable<TriFicheVitesse>{
    private Fiche fiche;


    @Override
    public int compareTo(TriFicheVitesse comparable) {
        return Integer.compare(fiche.getVitesseMax(), comparable.fiche.getVitesseMax());
    }
}
