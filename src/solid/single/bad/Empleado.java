package solid.single.bad;

public class Empleado {
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String nombre() {
        return this.nombre;
    }

    public String imprimirInforme() {
        return "Informe en formato IEEE del empleado " + this.nombre;
    }
}
