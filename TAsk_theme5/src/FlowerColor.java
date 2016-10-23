/**
 * Created by cs.ucu.edu.ua on 10/22/2016.
 */
public enum FlowerColor {
    WHITE, YELLOW, ORANGE, RED, PINK, BLUE, GREEN;

    public String toString() {
        switch(this) {
            case WHITE: return "white";
            case YELLOW: return "yellow";
            case ORANGE: return "orange";
            case RED: return "red";
            case PINK: return "pink";
            case BLUE: return "blue";
            case GREEN: return "green";
        }
        return null;
    }
    public static void main(String[] args) {
        FlowerColor color = GREEN;
        System.out.print(color);
    }
}
