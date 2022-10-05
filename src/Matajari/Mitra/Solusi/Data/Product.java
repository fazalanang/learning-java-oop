package Matajari.Mitra.Solusi.Data;

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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;

        if (this.price != product.price) {
            return false;
        }

        if (this.name != null) {
            return this.name.equals(product.name);
        }else {
            return product.name == null;
        }
    }
}