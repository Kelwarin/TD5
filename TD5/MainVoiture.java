package TD5;

public class MainVoiture {

    public static void main(String[] args) {
        Voiture voiture = new VoitureMoteurDiesel(new VoitureMoteurEssence(new VoitureFreinDisque(new Chassis())));
        System.out.println("voiture" + voiture);
    }
}
