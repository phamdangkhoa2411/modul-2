package ss7_Abstract_Class_Interface.Bai_tap.Colorable;

public class Square1 extends Shape1 implements Colorable{
    public double side = 1.0;

    public Square1() {
    }

    public Square1(double side) {
        this.side = side;
    }

    public Square1(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                ", side=" + this.side;
    }


    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}

