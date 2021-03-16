package solid.open.bad;

import solid.open.good.Shipping;

public class Order {

    private String lineItems;
    private String shipping;

    public Order(String lineItems, String shipping) {
        this.lineItems = lineItems;
        this.shipping = shipping;
    }

    public Integer getTotal(){
        return 0;
    }

    public String getShippingCost(){
        if(shipping == "ground"){
            return "costo terrestre";
        }
        if(shipping == "air"){
            return "costo aereo";
        }
        return "sin costo";
    }

}
