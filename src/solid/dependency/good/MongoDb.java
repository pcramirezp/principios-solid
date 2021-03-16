package solid.dependency.good;

public class MongoDb implements BaseDatos{

    @Override
    public void insertar() {
        System.out.println("insertar en una base de datos MongoDB");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar en una base de datos MongoDB");

    }

    @Override
    public void borrar() {
        System.out.println("borrar en una base de datos MongoDB");

    }
}
