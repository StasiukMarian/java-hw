package hw2.pcHierarchy;

import java.util.Objects;

public abstract class PC {
    private double monitor;
    private String motherboard;
    private String videoCard;
    private boolean dependOnElectricity;

    public PC() {
    }

    public PC(double monitor, String motherboard, String videoCard, boolean dependOnElectricity) {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.videoCard = videoCard;
        this.dependOnElectricity = dependOnElectricity;
    }

    public double getMonitor() {
        return monitor;
    }

    public void setMonitor(double monitor) {
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public boolean isDependOnElectricity() {
        return dependOnElectricity;
    }

    public void setDependOnElectricity(boolean dependOnElectricity) {
        this.dependOnElectricity = dependOnElectricity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return Double.compare(pc.monitor, monitor) == 0 && dependOnElectricity == pc.dependOnElectricity && Objects.equals(motherboard, pc.motherboard) && Objects.equals(videoCard, pc.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitor, motherboard, videoCard, dependOnElectricity);
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", motherboard='" + motherboard + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", dependOnElectricity=" + dependOnElectricity +
                '}';
    }
}
