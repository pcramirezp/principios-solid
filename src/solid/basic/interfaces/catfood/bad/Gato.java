package solid.basic.interfaces.catfood.bad;

public class Gato {

    private Integer energía;

    public Gato(Integer energía) {
        this.energía = energía;
    }

    public void comer(Salchicha salchicha) {
        this.energía += salchicha.getNutricion();
        System.out.println(this.energía);
    }

}
