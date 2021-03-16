package solid.liskov.bad;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private List<Documento> documentos;

    public Proyecto() {
        documentos = new ArrayList<Documento>();
    }

    public void agregarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public void abrirTodos(){
        for (Documento documento: documentos) {
            documento.abrir();
        }
    }

    public void guardarTodos() throws Exception {
        for (Documento documento: documentos) {
            if(!(documento instanceof DocumentoSoloLectura)) {
                documento.guardar();
            }
        }
    }
}
