package src;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmender = new FirePokemon("charmender", "Char Char", "burned meat", "blaze","burning tail","burning hot", "full of power");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", "Pika Pika", "everything", "static", "nails", "awesome", "amazing");
        WaterPokemon sharpedo = new WaterPokemon("Sharpedo", "Sha Sha", "small wailmer", "rough skin", "sharp teeth","blasting loud", "very slow");
        GrassPokemon venusaur = new GrassPokemon("Venusaur", "Venu Venu", "insects", "overgrow", "poisonous flower","really sharp", "very bright");
        //how can i access sound value of this instantieren (name value...)
        //charmender.getName();

        System.out.println("Firepokeman such as " + charmender.name.toUpperCase());
        charmender.eats();
        charmender.speaks();
        charmender.scratch();
        System.out.println("---End of Firepokemon---");

        System.out.println("Electric Pokemon such as " + pikachu.name.toUpperCase());
        pikachu.eats();
        pikachu.speaks();
        pikachu.scratch();
        System.out.println("---End of Electric Pokemon---");


        System.out.println("Water Pokemon such as " + sharpedo.name.toUpperCase());
        sharpedo.eats();
        sharpedo.speaks();
        sharpedo.scratch();
        System.out.println("---End of Water Pokemon---");

        System.out.println("Grass Pokemon such as " + venusaur.name.toUpperCase());
        venusaur.eats();
        venusaur.speaks();
        venusaur.scratch();
        System.out.println("---End of Grass Pokemon---");









    }
}
