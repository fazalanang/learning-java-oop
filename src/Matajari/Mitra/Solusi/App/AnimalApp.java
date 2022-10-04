package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Data.Animal;
import Matajari.Mitra.Solusi.Data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
