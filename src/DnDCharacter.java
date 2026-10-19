public class DnDCharacter {

    private String name;
    private int strength;
    private int intelligence;
    private int charisma;


    //    Hvad ville ske hvis vi ikke lavede en konstruktør?
    //      Så ville Java oprette en default constructor, uden nogle parametre.

    public DnDCharacter(String name, int strength, int intelligence, int charisma) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void displayCharacter() {
        System.out.println(name + " | STR: " + strength
                + " | INT: " + intelligence
                + " | CHA: " + charisma);
    }

    // Bonus: øger en stat med 1
    public void train(String stat) {
        switch (stat.toLowerCase()) {
            case "strength" -> strength++;
            case "intelligence" -> intelligence++;
            case "charisma" -> charisma++;
            default -> System.out.println("Ukendt stat: " + stat);
        }
    }
}