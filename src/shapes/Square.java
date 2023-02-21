package shapes;

public class Square extends Quadrilateral{

    protected int side;

    public Square( int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

//    public Square(int side) {
//        super(side, side);
//    }
//
//    @Override
//    public int getArea(){
//        return length * width;
//    }
//
//    @Override
//    public int getPerimeter(){
//        return length * 4;
//    }


}
