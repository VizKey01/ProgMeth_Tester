import java.awt.*;

public class Circle extends Shape {
    double radius;

    public circle(){
        setRadius(radius);
    }

    public circle(double r){
        setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
    double getParem(){
        return Math.PI*2*radius;
    }
    
    
    
}
