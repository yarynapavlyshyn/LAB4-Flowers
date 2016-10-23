/**
 * Created by cs.ucu.edu.ua on 10/23/2016.
 */
public enum  FlowerType {
    ROSE, POPPY, CHAMOMILE, CARNATION, PEONY, MALLOW, CORNFLOWER;

    public String toString() {
        switch(this) {
            case ROSE: return "rose";
            case POPPY: return "poppy";
            case CHAMOMILE: return "chamomile";
            case CARNATION: return "carnation";
            case PEONY: return "peony";
            case MALLOW: return "mallow";
            case CORNFLOWER: return "cornflower";
        }
        return null;
    }
}
