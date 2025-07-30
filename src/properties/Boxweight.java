package properties;

public class Boxweight extends Box {
    double weight;
    double l;

    public Boxweight(double h, double w, double l, double weight,double l1) {

        super(h, w, l);
        this.weight = weight;

    }

    public Boxweight() {

    }

    public Boxweight(double l, double weight) {
        this.weight = weight;
    }
}
