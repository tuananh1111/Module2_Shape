public class Rectangle extends Shape {
    private double width= 1.0;
    private double height=1.0;
    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width, double height, String color, boolean filled){
        super(color,filled);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                super.toString();
    }
}
