package src;

public class GrassPokemon extends Pokemon {
    private String bladeScore;
    private String beamScore;

    public GrassPokemon(String name, String sound, String food, String ability, String scratchType, String bladeScore, String beamScore) {
        super(name, sound, food, ability, scratchType);
        this.bladeScore = bladeScore;
        this.beamScore = beamScore;
    }

    public String getBladeScore() {
        return bladeScore;
    }

    public void setBladeScore(String bladeScore) {
        this.bladeScore = bladeScore;
    }

    public String getBeamScore() {
        return beamScore;
    }

    public void setBeamScore(String beamScore) {
        this.beamScore = beamScore;
    }


    @Override
    public void scratch() {
        System.out.println("A grass pokemon like " + name + " uses his " + scratchType + " for a harsh scratch attack");

    }
}
