public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "eko";

        System.out.println(person1.name);

        person1.sayHello("Budi");

        Person person2 = new Person();
        person2.name = "lisa";
        person2.sayHello("dini");

        Person person3;
        person3 = new Person();
        person3.name = "joko";
        person3.sayHello("faza");
    }
}
