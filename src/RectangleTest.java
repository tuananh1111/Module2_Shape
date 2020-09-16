public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle);
        rectangle= new Rectangle(5,2);
        System.out.println(rectangle);
        rectangle=new Rectangle(5,2,"Red",false);
        System.out.println(rectangle);
    }
}
