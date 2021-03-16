package solid.open.good;

public class Main {

    public static void main(String args[]){
        Order orden1 = new Order(new String(), new Ground());
        Order orden2 = new Order(new String(), new Air());

        System.out.println(orden1.getShippingCost());
        System.out.println(orden2.getShippingCost());
    }

}
