public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "eko";
        person1.address = "Jakarta";
        // person1.country = "USA"; ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
    }
}
