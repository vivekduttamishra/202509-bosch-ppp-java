//main class

public class Program {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
            new Rectangle(5, 10),
            new RectSquare(5),
           // new Square(4), //not allowed
            new Rectangle(14,7)
        };

        for(var rectangle : rectangles) {
            rectangle.draw();
            System.out.println("Rectangle width: " + rectangle.getWidth());
            System.out.println("Rectangle height: " + rectangle.getHeight());
            System.out.println("Rectangle area: " + rectangle.getArea());
            System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
            System.out.println("Orientation: " + rectangle.getOrientation());
            System.out.println();
        }


        var square = new RectSquare(5);
        square.setHeight(10);
        square.draw();
    }
}