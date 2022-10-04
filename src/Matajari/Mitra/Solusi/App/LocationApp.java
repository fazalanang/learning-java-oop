package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Data.City;

import Matajari.Mitra.Solusi.Data.Location;

public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); //Error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
