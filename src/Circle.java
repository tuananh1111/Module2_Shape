public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public  double getArea(){
        return this.radius*this.radius*3.1459;
    }
    public double getPerimeter(){
        return 2*this.radius*3.1459;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", which is a subclass of "+super.toString();
    }
}
