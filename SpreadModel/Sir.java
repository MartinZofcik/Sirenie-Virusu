package SpreadModel;


public class Sir {

    public Sir() {
    }

    public void spreadSir(Population.Population population, Disease.Disease disease){
        int beta1 = (int)(disease.getBeta() * population.getI() * population.getS() / population.getN());
        int gamma1 = (int)disease.getGamma() * population.getI();
        if(beta1 > population.getS())
            beta1 = population.getS();
        population.setS(population.getS() - beta1);
        population.setI(population.getI() + (beta1 - gamma1));
        population.setR(population.getR() + gamma1);
        population.setN(population.getS() + population.getI() + population.getR());
    }
}
