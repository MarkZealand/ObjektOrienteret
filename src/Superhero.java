public class Superhero {

    private String name;
    private String power;
    private int level;

    public Superhero(String name, String power, int level){
        this.name = name;
        this.power = power;
        this.level = level;
    }

    public  String getName() {
        return name;
    }
    public String getPower() {
        return power;
    }
    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void displayDetails(){
        System.out.println(name + " | " + power + " | " + level);
    }
    public void levelUp(){
        level++;
    }
}
