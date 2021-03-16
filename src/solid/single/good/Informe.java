package solid.single.good;

public class Informe {

    public static String imprimirInforme(Empleado empleado) {
        return "Informe en formato IEEE del empleado " + empleado.nombre();
    }

}
