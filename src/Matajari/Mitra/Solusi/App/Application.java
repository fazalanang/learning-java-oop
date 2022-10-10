package Matajari.Mitra.Solusi.App;

import Data.Product;
import Matajari.Mitra.Solusi.Data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product ("Mac book pro",30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
