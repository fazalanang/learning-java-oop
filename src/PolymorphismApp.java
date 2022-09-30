class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayhello("Budi");

        employee = new Manager("Eko");
        employee.sayhello("Budi");

        employee = new vicePresident("Eko");
        employee.sayhello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new vicePresident("Budi"));

    }

    static void sayHello(Employee employee){
        System.out.println("Hello " + employee.name);
    }
}
