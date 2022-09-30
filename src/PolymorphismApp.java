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
        if (employee instanceof vicePresident) {
            vicePresident VicePresident = (vicePresident) employee;
            System.out.println("Hello VP "+ VicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
