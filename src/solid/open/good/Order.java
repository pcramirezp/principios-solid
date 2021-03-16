package solid.open.good;

public class Order {

    private String lineItems;
    private Shipping shipping;

    public Order(String lineItems, Shipping shipping) {
        this.lineItems = lineItems;
        this.shipping = shipping;
    }

    public Integer getTotal(){
        return 0;
    }

    public String getShippingCost(){
        return shipping.getCost(this);
    }

}
