package solid.liskov.bad;

public class DocumentoSoloLectura extends Documento {

    public DocumentoSoloLectura(String datos, String nombreArchivo) {
        super(datos, nombreArchivo);
    }

    @Override
    public void guardar() throws Exception {
        throw  new Exception("Archivo no se puede guardar");
    }
}
