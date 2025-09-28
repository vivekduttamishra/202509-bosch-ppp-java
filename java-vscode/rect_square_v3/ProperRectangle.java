

public class ProperRectangle implements Rectangle{
    private double width;
    private double height;

    public ProperRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
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
        System.out.println(this);
    }

    @Override
    public String toString() {
      return getClass().getName()+" [" + width + " , " + height+" ]"  ; 
    }
}