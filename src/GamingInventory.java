public class GamingInventory {

    public String name;
    public String type;
    public int value;

    public GamingInventory(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getValue(){
        return value;
    }
    public void use(){
        System.out.println("You used item: " + name + " of type: " + type + " with value: " + value);
    }
    public void displayItem(){
        System.out.println("Item: " + name + " of type: " + type + " with value: " + value);
    }
}
