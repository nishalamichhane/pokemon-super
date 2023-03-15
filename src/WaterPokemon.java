package src;

public class WaterPokemon extends Pokemon {
    /* variables */
    private String canonScore;
    private String danceScore;

    /* constructors */
    public WaterPokemon(String name, String sound, String food, String ability, String scratchType, String canonScore, String danceScore) {
        super(name, sound, food, ability, scratchType);
        this.canonScore = canonScore;
        this.danceScore = danceScore;
    }
    @Override
    public void scratch() {
        System.out.println("A water pokemon " + name + " uses his "  + scratchType + " for scratch attack");
    }
    //getters en setters

    public String getCanonScore() {
        return canonScore;
    }

    public void setCanonScore(String canonScore) {
        this.canonScore = canonScore;
    }

    public String getDanceScore() {
        return danceScore;
    }

    public void setDanceScore(String danceScore) {
        this.danceScore = danceScore;
    }
}
