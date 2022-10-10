package Matajari.Mitra.Solusi.App;

import Data.City;

public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); //Error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
