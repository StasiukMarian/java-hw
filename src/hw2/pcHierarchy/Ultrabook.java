package hw2.pcHierarchy;

public class Ultrabook extends Laptop{


    public Ultrabook() {
    }

    public Ultrabook(double monitor, String motherboard, String videoCard, boolean dependOnElectricity, int screenWidth, boolean touchScreen, int timeWithoutCharging) {
        super(monitor, motherboard, videoCard, dependOnElectricity, screenWidth, touchScreen, timeWithoutCharging);
    }

    public void compact (){
        System.out.println("Ultrabooks is the most compact notebooks");
    }
}
