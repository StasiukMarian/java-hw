package hw2.pcHierarchy;

import java.util.Objects;

public class Workstation extends Laptop{
    public String specialFunctions;

    public Workstation() {
    }

    public Workstation(double monitor, String motherboard, String videoCard, boolean dependOnElectricity, int screenWidth, boolean touchScreen, int timeWithoutCharging, String specialFunctions) {
        super(monitor, motherboard, videoCard, dependOnElectricity, screenWidth, touchScreen, timeWithoutCharging);
        this.specialFunctions = specialFunctions;
    }

    public String getSpecialFunctions() {
        return specialFunctions;
    }

    public void setSpecialFunctions(String specialFunctions) {
        this.specialFunctions = specialFunctions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Workstation that = (Workstation) o;
        return Objects.equals(specialFunctions, that.specialFunctions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialFunctions);
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "specialFunctions='" + specialFunctions + '\'' +
                '}';
    }

    public void compact (){
        System.out.println("Workstation is not a compact PC , but very powerful");
    }
}
