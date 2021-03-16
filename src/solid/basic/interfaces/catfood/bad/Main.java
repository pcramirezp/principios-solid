package solid.basic.interfaces.catfood.bad;


import solid.dependency.bad.BaseMySql;
import solid.dependency.bad.Reporte;

public class Main {

    public static void main(String args[]){
        Gato cosmo = new Gato(100);
        Salchicha coctel = new Salchicha(50, "rojo", "febrero2022");
        cosmo.comer(coctel);
    }

}
