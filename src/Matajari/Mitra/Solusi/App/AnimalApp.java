package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Annotation.Fancy;
import Data.Animal;
import Data.Cat;
//Annotation//
@Fancy(name = "AnimalApp", tags = {"application","java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
