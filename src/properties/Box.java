package properties;

public class Box {
    double h;
    double w;
    double l;

    public Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    public Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }
}
