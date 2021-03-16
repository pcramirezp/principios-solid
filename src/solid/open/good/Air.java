package solid.open.good;

public class Air implements Shipping{

    @Override
    public String getCost(Order order) {
        return "costo aereo";
    }

    @Override
    public String getDate(Order order) {
        return "fecha area";
    }
}
