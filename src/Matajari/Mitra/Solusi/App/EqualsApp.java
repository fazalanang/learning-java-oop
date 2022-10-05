package Matajari.Mitra.Solusi.App;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Faza";
        first = first + " " + "Lanang";

        System.out.println(first);

        String second = "Faza Lanang";
        System.out.println(second);

        System.out.println(first == second); //false
        System.out.println(first.equals(second)); //true

        String third = "Faza Lanang";

        System.out.println(second == third); //true
    }
}
