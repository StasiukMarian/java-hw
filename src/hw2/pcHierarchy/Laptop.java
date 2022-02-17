package hw2.pcHierarchy;

import java.util.Objects;

public class Laptop extends PC{
    private int screenWidth;
    private boolean touchScreen;
    private int timeWithoutCharging;

    public void compact (){
        System.out.println("Laptops is compact but less then Ultrabook's");
    }

    public Laptop() {
    }

    public Laptop(double monitor, String motherboard, String videoCard, boolean dependOnElectricity, int screenWidth, boolean touchScreen, int timeWithoutCharging) {
        super(monitor, motherboard, videoCard, dependOnElectricity);
        this.screenWidth = screenWidth;
        this.touchScreen = touchScreen;
        this.timeWithoutCharging = timeWithoutCharging;
    }


    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public int getTimeWithoutCharging() {
        return timeWithoutCharging;
    }

    public void setTimeWithoutCharging(int timeWithoutCharging) {
        this.timeWithoutCharging = timeWithoutCharging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return screenWidth == laptop.screenWidth && touchScreen == laptop.touchScreen && timeWithoutCharging == laptop.timeWithoutCharging;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenWidth, touchScreen, timeWithoutCharging);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenWidth=" + screenWidth +
                ", touchScreen=" + touchScreen +
                ", timeWithoutCharging=" + timeWithoutCharging +
                '}';
    }
}
