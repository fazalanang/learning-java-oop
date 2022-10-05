package Matajari.Mitra.Solusi.Data;

public class Avanza implements Car {

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "toyota";
    }
}
