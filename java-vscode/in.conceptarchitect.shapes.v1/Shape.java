
public class Shape{
    ShapeType type;
    double radius;
    double width, height;

    Shape(double radius){
        this.type=ShapeType.CIRCLE;
        this.radius=radius;
    }
    Shape(double width, double height){
        this.type=ShapeType.RECTANGLE;
        this.width=width;
        this.height=height;
    }

    double area(){
        double area=0;
        switch(type){
            case CIRCLE: 
                area=Math.PI*radius*radius;
            case RECTANGLE: 
                area= width*height;
        }
        return area;
    }

    double perimeter(){
        double perimeter=0;
        switch(type){
            case CIRCLE: 
                perimeter=2*Math.PI*radius;
            case RECTANGLE: 
                perimeter= 2*(width+height);
        }
        return perimeter;
    }

    double draw(){
        if(type==ShapeType.CIRCLE)
            System.out.println("("+radius+")");
        else
            System.out.println("Drawing Rectangle of width "+width+" and height "+height);
    }

    
}