package solid.basic.interfaces.catfood.good;

public class Salchicha implements Comida{

    private Integer nutricion;
    private String color;
    private String vencimiento;

    public Salchicha(Integer nutricion, String color, String vencimiento) {
        this.nutricion = nutricion;
        this.color = color;
        this.vencimiento = vencimiento;
    }

    public Integer getNutricion() {
        return nutricion;
    }

    public String getColor() {
        return color;
    }

    public String getVencimiento() {
        return vencimiento;
    }
}
