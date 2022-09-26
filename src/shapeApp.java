public class shapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getConner());

        var rectangle = new Rectangel();
        System.out.println(rectangle.getConner());
        System.out.println(rectangle.getParentConner());
    }
}
