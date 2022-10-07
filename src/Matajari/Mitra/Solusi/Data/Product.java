package Matajari.Mitra.Solusi.Data;

import java.util.Objects;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    //toString() Method//
    public String toString() {
        return "Product name: "+ name + ", price" + price;
    }

    //Code --> Generate --> equals() and hashCode()//
    @Override
    //equals()//
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
    @Override
    //hashCode()//
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

}