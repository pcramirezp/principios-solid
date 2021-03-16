package solid.dependency.bad;

public class Reporte {

    private BaseMySql baseMySql;

    public Reporte(BaseMySql baseMySql) {
        this.baseMySql = baseMySql;
    }

    public void abrir(){
        baseMySql.insertar();
    }

    public void guardar() {
        baseMySql.actualizar();
    }

}
