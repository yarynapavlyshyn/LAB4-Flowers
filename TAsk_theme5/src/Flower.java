/**
 * Created by cs.ucu.edu.ua on 10/21/2016.
 */
public class Flower {
    protected FlowerSpec spec;

    public Flower(FlowerSpec spec) {
        this.spec = spec;
    }
    public FlowerSpec getSpec() {
        return spec;
    }
    public String toString() {
        return spec.toString();
    }
    public static void main(String[] args) {
        FlowerSpec spec = new FlowerSpec(FlowerColor.YELLOW, 2.5, true, 1.3, FlowerType.ROSE);
        Flower f = new Flower(spec);
        System.out.println(f.toString());
    }
}