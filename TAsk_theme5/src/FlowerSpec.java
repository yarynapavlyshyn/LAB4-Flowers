/**
 * Created by cs.ucu.edu.ua on 10/22/2016.
 */
public class FlowerSpec {
    private FlowerColor color;
    private double length;
    private boolean fresh;
    private double price;
    private FlowerType type;

    public FlowerSpec (FlowerColor color, double length, boolean fresh, double price, FlowerType type) {
        this.color = color;
        this.length = length;
        this.fresh = fresh;
        this.price = price;
        this.type = type;
    }
    public FlowerColor getColor () {
        return color;
    }
    public double getLength() {
        return length;
    }
    public boolean isFresh() {
        return fresh;
    }
    public double getPrice() {
        return price;
    }
    public FlowerType getType () {
        return type;
    }
    public String toString() {
        return "Type: " + getType() + ", price is " + String.valueOf(getPrice()) + ", its color is " + getColor() + ", fresh level is " + String.valueOf(isFresh()) + ", its height " + String.valueOf(getLength());
    }
    public static void main(String[] args) {
        FlowerSpec f = new FlowerSpec(FlowerColor.YELLOW, 2.5, true, 1.3, FlowerType.ROSE);
        System.out.println(f.toString());
    }
}
