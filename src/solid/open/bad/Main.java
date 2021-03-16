package solid.open.bad;



public class Main {

    public static void main(String args[]){
        Order orden1 = new Order("orden1", "ground");
        Order orden2 = new Order("orden2", "air");

        System.out.println(orden1.getShippingCost());
        System.out.println(orden2.getShippingCost());
    }

}
