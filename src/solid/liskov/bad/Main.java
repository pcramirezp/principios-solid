package solid.liskov.bad;


import solid.open.bad.Order;

public class Main {

    public static void main(String args[]){
        Proyecto proyecto = new Proyecto();
        proyecto.agregarDocumento(new Documento("Tesis sobre algo", "tesis"));
        proyecto.agregarDocumento(new DocumentoSoloLectura("Contrato derechos", "contrato"));
        proyecto.agregarDocumento(new Documento("Anexos investigacion", "anexo"));
        proyecto.abrirTodos();
        try {
            proyecto.guardarTodos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
