public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public String toString() {
        return "X: " + x + ", Y: " + y;
    }
}
