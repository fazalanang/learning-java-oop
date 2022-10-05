package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Data.Avanza;
import Matajari.Mitra.Solusi.Data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
