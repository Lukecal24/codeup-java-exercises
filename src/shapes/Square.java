package shapes;

public class Square extends Rectangle{

private static int side;


    public Square(int side) {
        super(side, side);
    }


    public int getArea(){
        int side = super.getLength();
        return side * side;
    }


    public int getPerimeter(){
        int side = super.getLength();
        return side * 4;
    }


}
