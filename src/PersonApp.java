public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("eko","Jakarta");

        System.out.println(person1.name);
         System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("lisa","makassar");

        Person person3;
        person3 = new Person("joko","palembang");
        person3.sayHello("dika");
    }
}
