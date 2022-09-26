class Manager {
    String name;
    void sayhello (String name) {
        System.out.println("Hi " + name + ", My name is manager " + this.name);
    }
}
class vicePresident extends Manager {
    String name;
    void sayhello (String name) {
        System.out.println("Hi " + name + ", My name is vp " + this.name);
    }
}
