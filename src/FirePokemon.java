package src;
//Firepokemon is subclass
public class FirePokemon extends Pokemon {
    private String infernoScore;
    private String flameScore;

    //constructor aangeroepen
    public FirePokemon(String name, String sound, String food, String ability, String scratchType, String infernoScore, String flameScore) {
        super(name, sound, food, ability, scratchType);
        this.infernoScore = infernoScore;
        this.flameScore = flameScore;
    }

    public String getInfernoScore() {
        return infernoScore;
    }

    public void setInfernoScore(String infernoScore) {
        this.infernoScore = infernoScore;
    }

    public String getFlameScore() {
        return flameScore;
    }

    public void setFlameScore(String flameScore) {
        this.flameScore = flameScore;
    }
//methods
   @Override
    public  void scratch(){
       System.out.println("A fire pokemon"+ name + "uses" + scratchType+ " for a fierce scratch attack");
   }

}
