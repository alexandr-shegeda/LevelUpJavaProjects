/**
 * Created by java on 23.12.2016.
 */
public class Coin {

    private double weight;
    private double diameter;

    public Coin(double weight, double diameter) throws CoinLogicException {
        if(diameter < 0) throw new CoinLogicException("Diameter should be positive");
        this.weight = weight;
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
