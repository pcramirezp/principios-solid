package solid.basic.interfaces.catfood.good;

public class Gato {

    private Integer energía;

    public Gato(Integer energía) {
        this.energía = energía;
    }

    public void comer(Comida comida) {
        this.energía += comida.getNutricion();
        System.out.println(this.energía);
    }

}
