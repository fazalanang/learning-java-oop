class Manager extends Employee {
    Manager(String name){
        super(name);
    }
    String company;
    Manager(String name, String company){
        super(name);
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
