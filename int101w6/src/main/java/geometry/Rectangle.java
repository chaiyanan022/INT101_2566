package geometry;

public class Rectangle {
    private static final double MINIMUM_SIZE = 1.0;
    private double width;
    private double length;
    
    public Rectangle(double width,double length){
        if (width < 0 || length < 0){
            throw new RuntimeException("width and length can not be zero or less");
        }
        double temp;
        if(width > length){
            temp = width;
            width = length;
            length = temp;
        }
        this.width = (width > MINIMUM_SIZE) ? width : MINIMUM_SIZE;
        this.length = (length > MINIMUM_SIZE) ? length : MINIMUM_SIZE;
        //ternary expression :: boolean-expression ? true-expression : false-expression
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}
