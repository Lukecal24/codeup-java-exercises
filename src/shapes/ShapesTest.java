package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        Measurable myShape1 = new Rectangle(5,6 );

        System.out.println("Square");
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("Rectangle");
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());


    }
}
