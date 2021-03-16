package solid.liskov.good;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

    private List<Documento> todosDocumentos;
    private List<DocumentoEditable> documentosEditables;

    public Proyecto() {
        todosDocumentos = new ArrayList<Documento>();
        documentosEditables = new ArrayList<DocumentoEditable>();
    }

    public void agregarDocumento(Documento documento) {
        if (documento instanceof DocumentoEditable) {
            this.documentosEditables.add((DocumentoEditable) documento);
        }
        this.todosDocumentos.add(documento);

    }

    public void abrirTodos(){
        for (Documento documento: todosDocumentos) {
            documento.abrir();
        }
    }

    public void guardarTodos() {
        for (DocumentoEditable documento: documentosEditables) {
            documento.guardar();
        }
    }
}
