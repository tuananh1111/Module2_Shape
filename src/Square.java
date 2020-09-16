public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setHeight(double height){
        setSide(height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side='" + getSide()  +
                ", which is a subclass of " + super.toString() +
                '}';
    }
}
