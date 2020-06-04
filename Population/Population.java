package Population;
//len drzi data
public class Population {
    private int s;
    private int i;
    private int r;

    private double f;

    private int n;

    public Population(int s, int i, int r, int n) {
        this.s = s;
        this.i = i;
        this.r = r;
        this.n = n;
    }

    public Population(int s, int i, int r, double f, int n) {
        this.s = s;
        this.i = i;
        this.r = r;
        this.f = f;
        this.n = n;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getF() {
        return f;
    }

    public int getN() { return n; }

    public void setN(int n) { this.n = n; }
}
