package Matajari.Mitra.Solusi.App;

import Data.Avanza;
import Data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
