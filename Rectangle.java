public class Rectangle extends Shapes{

    double length;
    double height;
    @Override
    public double getArea(double length, double height) {
        return this.length * this.height;
    }
}
