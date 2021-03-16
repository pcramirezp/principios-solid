package solid.basic.interfaces.catfood.good;

public class Atun implements Comida{

    private Integer nutricion;
    private String marca;


    public Atun(Integer nutricion, String marca) {
        this.nutricion = nutricion;
        this.marca = marca;
    }

    public Integer getNutricion() {
        return nutricion;
    }

    public String getMarca() {
        return marca;
    }


}
