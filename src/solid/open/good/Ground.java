package solid.open.good;

public class Ground implements Shipping{

    @Override
    public String getCost(Order order) {
        return "costo terrestre";
    }

    @Override
    public String getDate(Order order) {
        return "fecha terrestre";
    }
}
