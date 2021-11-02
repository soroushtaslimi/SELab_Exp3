public class Square implements HasArea{
    private double side;

    public Square(double side) {
        this.setSide(side);
    }

    @Override
    public double computeArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0)
            throw new IllegalArgumentException();
        this.side = side;
    }

}
