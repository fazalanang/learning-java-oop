package Matajari.Mitra.Solusi.App;

import Data.Customer;
import Data.Level;


public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Faza");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.print(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //konversi//
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("Print Level");
        for (var value :Level.values()) {
            System.out.println(value);
        }
    }
}
