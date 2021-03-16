package solid.inferface.bad;

public interface ProveedorCloud {

    public void guardarArchivo(String nombre);

    public void obtenerArchivo(String nombre);

    public void crearServidor(String region);

    public void listarServidores(String region);

    public void obtenerDireccionCDN();

}
