//main class

public class Program {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
            new ProperRectangle(5, 10),
            //new RectSquare(5),
            new Square(4),
            new ProperRectangle(14,7)
        };

        for(var rectangle : rectangles) {
            rectangle.draw();
            System.out.println("Rectangle area: " + rectangle.getArea());
            System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
            System.out.println();
        }


        
    }
}