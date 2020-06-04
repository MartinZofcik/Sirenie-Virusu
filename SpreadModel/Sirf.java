package SpreadModel;

public class Sirf extends Sir {

    private double f;

    public Sirf(double f) {
        this.f = f;
    }

    public void spreadSirf(Population.Population population, Disease.Disease disease){
        int beta1 = (int) (((1 - f) * population.getN()) - (disease.getBeta() * population.getI() * population.getS() / population.getN()));
        int gamma1 = (int)disease.getGamma() * population.getI();
        if(beta1 > population.getS())
            beta1 = population.getS();
        population.setS(population.getS() - beta1);
        population.setI(population.getI() + (beta1 - gamma1));
        population.setR((int)(population.getR() + gamma1 + f * population.getN()));
        population.setN(population.getS() + population.getI() + population.getR());
    }


}
