package Disease;

public class Flu extends Disease{
    private double beta = 2;
    private double gamma = 5;

    public Flu() {
        super.setBeta(beta);
        super.setGamma(gamma);
    }
}
