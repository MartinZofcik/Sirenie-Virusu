package Disease;

public class Disease {
    private double beta;
    private double gamma;

    public Disease() {
    }

    public Disease(double beta, double gamma) {
        this.beta = beta;
        this.gamma = gamma;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }

    public double getR0() {
        return beta / gamma;
    }

}
