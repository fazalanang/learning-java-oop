class Manager {
    String name;
    Manager(String name){
        this.name = name;
    }
    String company;
    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }
    void sayhello (String name) {
        System.out.println("Hi " + name + ", My name is manager " + this.name);
    }
}
class vicePresident extends Manager {
    vicePresident(String name){
        super(name);
    }
    void sayhello (String name) {
        System.out.println("Hi " + name + ", My name is vp " + this.name);
    }
}
