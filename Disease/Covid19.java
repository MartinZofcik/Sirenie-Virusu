package Disease;

public class Covid19 extends Disease{
    private double beta = 3;
    private double gamma = 2;

    public Covid19() {
        super.setBeta(beta);
        super.setGamma(gamma);
    }
}
