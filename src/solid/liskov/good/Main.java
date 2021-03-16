package solid.liskov.good;


public class Main {

    public static void main(String args[]){
        Proyecto proyecto = new Proyecto();
        proyecto.agregarDocumento(new DocumentoEditable("Tesis sobre algo", "tesis"));
        proyecto.agregarDocumento(new Documento("Contrato derechos", "contrato"));
        proyecto.agregarDocumento(new DocumentoEditable("Anexos investigacion", "anexo"));
        proyecto.abrirTodos();
        proyecto.guardarTodos();

    }

}
