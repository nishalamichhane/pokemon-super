package src;
//Pokemon is superclass
public  abstract class Pokemon {
    //variabele aanmaken
    public String name;
    private String sound;
    private String food;
    private String ability;
    public String scratchType;

    /* constructor aanroepen */
    public Pokemon(String name, String sound, String food, String ability, String scratchType) {
        this.name = name;
        this.sound = sound;
        this.food = food;
        this.ability = ability;
        this.scratchType = scratchType;
    }

   //getters en setters aanroepen


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getScratchType() {
        return scratchType;
    }

    public void setScratchType(String scratchType) {
        this.scratchType = scratchType;
    }

    /* methods */
    public void eats() {
        System.out.println(name + " eats: " + food);
    }

    public void speaks() {
        System.out.println(name + " says: " + sound);
    }

    public abstract void scratch();

}
