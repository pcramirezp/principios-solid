package solid.basic.interfaces.catfood.good;


public class Main {

    public static void main(String args[]){
        Gato cosmo = new Gato(100);
        Salchicha coctel = new Salchicha(50, "rojo", "febrero2022");
        Atun atunaceite = new Atun(25, "vikingo");
        cosmo.comer(coctel);
        cosmo.comer(atunaceite);
    }

}
