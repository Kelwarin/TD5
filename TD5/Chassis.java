package TD5;

public class Chassis implements Voiture{

    public int getAcceleration() {
        return 0;
    }

    public int getFreinage() {
        return 0;
    }

    public int getMasse() {
        return 700;
    }

    public int getPrix() {
        return 3000;
    }

    public String toString() {
        return ", chassis";
    }
}
