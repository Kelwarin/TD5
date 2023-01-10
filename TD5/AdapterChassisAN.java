package TD5;

public class AdapterChassisAN extends ChassisAnglais implements Voiture{
    public int getAcceleration(){
        return super.getAcceleration();
    }
    public int getFreinage(){
        return super.getBraking();
    }
    public int getMasse(){
        return super.getMass();
    }
    public int getPrix(){
        return super.getPrice();
    }
}
