package Tools;


// od nej budu dedit konkretne nastroje
public abstract class Tool {

    public Tool() {
    }

    public void increaseBeta(Disease.Disease disease, double i){
        disease.setBeta(disease.getBeta() + i);
    }

    public void decreaseBeta(Disease.Disease disease, double i){
        disease.setBeta(disease.getBeta() - i);
    }

    public void reduceSick(Population.Population population, int n){
        population.setI(population.getI() - n);
        population.setR(population.getR() + n);
    }

    public void increaseSick(Population.Population population, int n){
        population.setS(population.getI() - n);
        population.setI(population.getR() + n);
    }







}
