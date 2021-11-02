public class Rectangle implements HasArea{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width <= 0)
            throw new IllegalArgumentException();
        this.width = width;
    }

    public void setHeight(double height) {
        if(height <= 0)
            throw new IllegalArgumentException();
        this.height = height;
    }
}
