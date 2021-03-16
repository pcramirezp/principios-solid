package solid.dependency.bad;


import solid.open.bad.Order;

public class Main {

    public static void main(String args[]){
        Reporte reporte1 = new Reporte(new BaseMySql());

        reporte1.abrir();
        reporte1.guardar();

    }

}
