package Matajari.Mitra.Solusi.App;

import Data.Application;
import Data.Constant;
import Data.Country;
import Matajari.Mitra.Solusi.Utill.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Jakarta");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}
