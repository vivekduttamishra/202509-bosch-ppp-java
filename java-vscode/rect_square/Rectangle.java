

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public Orientation getOrientation() {
        if (width > height) {
            return Orientation.Horizontal;
        } 
        else {
            return Orientation.Vertical;
        }
    }

    public void draw() {
        System.out.println("Rectangle [" + width + " , " + height+" ]");
    }
}