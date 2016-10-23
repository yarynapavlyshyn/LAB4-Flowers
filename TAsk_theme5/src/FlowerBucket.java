/**
 * Created by cs.ucu.edu.ua on 10/21/2016.
 */
import java.util.ArrayList;

public class FlowerBucket {
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];

    public void addFlower(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            Flower tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getSpec().getPrice() < a[j].getSpec().getPrice())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i ++) {
            sum += a[i].getSpec().getPrice();
        }
        return sum;
    }
    public Flower[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            FlowerSpec spec = a[i].getSpec();
            if (spec.getLength() <= end && spec.getLength() >= start ) {
                tmpSize ++;
            }
        }
        Flower[] tmpPart = new Flower[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getSpec().getLength() <= end && a[i].getSpec().getLength() >= start ) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex ++;
            }
        }
        return tmpPart;
    }

    public ArrayList<Flower> getFlower(FlowerType type){

        ArrayList<Flower> tmp = new ArrayList<Flower>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getSpec().getType().equals(type)) {
                tmp.add(a[i]);
            }
        }

        return tmp;
    }

    public Flower[] searchFlower(FlowerSpec flower){

        Flower[] tmp = new Flower[defaultSize];
        int pos = 0;
        for (int i = 0; i < insertIndex; i++) {
            FlowerSpec flowerToSearch = a[i].getSpec();
            if (flowerToSearch.getType() != (flower.getType()))
                continue;
            if (flowerToSearch.getColor() != flower.getColor())
                continue;
            if (flowerToSearch.getLength() != flower.getLength())
                continue;
            tmp[pos] = a[i];
            pos++;
        }
        return tmp;
    }
}
