package solid.dependency.good;

public class Main {

    public static void main(String args[]){
        Reporte reporte1 = new Reporte(new MySql());
        Reporte reporte2 = new Reporte(new MongoDb());

        reporte1.abrir();
        reporte1.guardar();

        reporte2.abrir();
        reporte2.guardar();

    }

}
