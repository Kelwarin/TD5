package TD5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainVoiture {

    public static void main(String[] args) {
        VoitureMontee voiture = new VoitureMoteurDiesel(new VoitureMoteurEssence(new VoitureFreinDisque(new Chassis())));
        Fiche fiche1 = new Fiche(voiture,500, 20);
        Fiche fiche2 = new Fiche(voiture,300, 30);
        ArrayList<TriFicheVitesse> triFiches = new ArrayList<>();
        triFiches.add(new TriFicheVitesse(fiche1));
        triFiches.add(new TriFicheVitesse(fiche2));
        Collections.sort(triFiches);
        ArrayList<Fiche> fiches = new ArrayList<>();
        for(TriFicheVitesse tf : triFiches){
            fiches.add(tf.getFiche());
        }
        for(Fiche f : fiches){
            System.out.println("voiture" + f);
        }
    }
}
