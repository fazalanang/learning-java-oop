package Matajari.Mitra.Solusi.App;

import Matajari.Mitra.Solusi.Data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());
    }
}
