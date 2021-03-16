package solid.inferface.good;

public class Amazon implements ProveedorAlmacenamiento, ProveedorHosting, ProveedorCDN{

    @Override
    public void guardarArchivo(String nombre) {

    }

    @Override
    public void obtenerArchivo(String nombre) {

    }

    @Override
    public void obtenerdireccionCDN() {

    }

    @Override
    public void crearServidor(String region) {

    }

    @Override
    public void listarServidores(String region) {

    }
}
