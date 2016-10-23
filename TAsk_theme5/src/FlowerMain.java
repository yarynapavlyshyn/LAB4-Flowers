/**
 * Created by cs.ucu.edu.ua on 10/21/2016.
 */

public class FlowerMain {

     public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();

        FlowerSpec makSpec = new FlowerSpec(FlowerColor.GREEN, 15, true, 18.5, FlowerType.POPPY);
        FlowerSpec romashkaSpec = new FlowerSpec(FlowerColor.GREEN, 12, true, 12.5, FlowerType.CHAMOMILE);
        FlowerSpec hvozdykaSpec = new FlowerSpec(FlowerColor.PINK, 26, false, 15, FlowerType.CARNATION);

        Flower mak = new Flower(makSpec);
        Flower romashka = new Flower(romashkaSpec);
        Flower hvozdyka = new Flower(hvozdykaSpec);

        FlowerSpec findFlower = new FlowerSpec(FlowerColor.GREEN, 12, true, 0, FlowerType.CHAMOMILE);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);
        bucket.addFlower(hvozdyka);

        System.out.println("Has POPPY type: "+ bucket.getFlower(FlowerType.POPPY));
        System.out.println("Found flowers: "+ bucket.searchFlower(findFlower));

        System.out.println();
        System.out.println("Total price: "+ bucket.getTotalPrice());
        System.out.println("Length from 10 to 18:");
        Flower[] matchedFlowers = bucket.selectFlowersByItsLength(10, 17);
        for (Flower f: matchedFlowers)
            System.out.println(f);

        System.out.println();

        System.out.println("Bucket before sorting:");
        System.out.println(bucket);
        System.out.println("... and after sorting by price:");
        bucket.sortByPrice();
        System.out.println(bucket);
    }
}