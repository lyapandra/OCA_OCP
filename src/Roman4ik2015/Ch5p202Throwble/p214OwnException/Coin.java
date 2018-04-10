package Roman4ik2015.Ch5p202Throwble.p214OwnException;

/**
 * Created by a on 08.04.2018.
 */
public class Coin {
    private double diameter;
    private double weight;
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double value) throws CoinLogicException {
        if(value <= 0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        diameter = value;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }

    public void doAction(String value) throws CoinLogicException, CoinTechnicalException {
        Coin ob = new Coin();
        try {
            double d = Double.parseDouble(value);
            ob.setDiameter(d);
            System.out.println("d = " + d);
        } catch (NumberFormatException e) {
            System.out.println("CoinTechnicalException");
            throw new CoinTechnicalException("incorrect symbol in string", e);
        } catch (CoinLogicException e) {
            System.out.println("CoinLogicException");
            System.err.println(e.getCause());
        }
    }

    public static void main(String[] args) throws CoinTechnicalException, CoinLogicException {
        Coin c = new Coin();
        c.doAction("h10");
    }
}