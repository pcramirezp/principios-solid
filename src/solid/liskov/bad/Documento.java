package solid.liskov.bad;

public class Documento {

    protected String datos;
    protected String nombreArchivo;

    public Documento(String datos, String nombreArchivo) {
        this.datos = datos;
        this.nombreArchivo = nombreArchivo;
    }

    public void abrir() {
        System.out.println("archivo " + nombreArchivo + " abierto");
    }

    public void guardar() throws Exception {
        System.out.println("archivo " + nombreArchivo + " guardar");

    }
}
