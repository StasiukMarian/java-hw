package hw2.pcHierarchy;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(17.2,"Asus","GeForce",false,16,false,4);
        laptop.compact();
        System.out.println(laptop);
        System.out.println("___________________");
        Ultrabook ultrabook = new Ultrabook(13.1,"Asus", "GeForce", false,14,true,6);
        System.out.println(ultrabook);
        ultrabook.compact();
        System.out.println("___________________");
        Workstation workstation = new Workstation(20,"Asus","GeForce",true,20,false,0,"Fast calculate , geodesy, high volume data");
        workstation.compact();
        System.out.println(workstation);
    }
}
