public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Eko";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
    }
}
