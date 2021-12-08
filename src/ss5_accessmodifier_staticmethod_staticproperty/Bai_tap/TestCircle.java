package ss5_accessmodifier_staticmethod_staticproperty.Bai_tap;

public class TestCircle {
    private double radius;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius ){
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getArea() {

        return Math.pow(this.radius, 2) * Math.PI;
    }

    public static void main(String[] args) {
        TestCircle circle = new TestCircle(1);
        System.out.println("Area: " + circle.getArea());
    }
}
