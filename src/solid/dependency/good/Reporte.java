package solid.dependency.good;

import solid.dependency.bad.BaseMySql;

public class Reporte {

    private BaseDatos baseDatos;

    public Reporte(BaseDatos base) {
        this.baseDatos = base;
    }

    public void abrir(){
        this.baseDatos.insertar();
    }

    public void guardar() {
        this.baseDatos.actualizar();
    }
}
