package solid.liskov.good;

public class DocumentoEditable extends Documento {

    public DocumentoEditable(String datos, String nombreArchivo) {
        super(datos, nombreArchivo);
    }

    public void guardar() {
        System.out.println("archivo " + nombreArchivo + " guardar");

    }
}
