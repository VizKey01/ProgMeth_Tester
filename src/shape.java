public abstract class shape {
    String name;
    abstract double getArea();
    abstract double getParem();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
