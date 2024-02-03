public class WTF extends shape{
    double width;
    double height;

    public WTF(double w, double h){
        setWidth(w);
        setHeight(h);
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

    @Override
    double getArea() {
        return this.width * this.height;
    }

    @Override
    double getParem() {
        return 2 * (this.width + this.height);
    }
}
