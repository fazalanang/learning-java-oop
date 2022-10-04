package Matajari.Mitra.Solusi.Data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("mac book pro",50_000_000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
