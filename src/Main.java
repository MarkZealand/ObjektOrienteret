import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);

    // Print menu
    System.out.println("========================================");
    System.out.println("           VÆLG EN OPGAVE");
    System.out.println("========================================");
    System.out.println("  0 - Opret spiller (Player)");
    System.out.println("  1 - Kør OpgaveEt");
    System.out.println("  2 - Opret DnD karakter");
    System.out.println("  3 - Gaming inventory");
    System.out.println("  4 - Find emoji");
    System.out.println("========================================");
    System.out.print("Indtast nummer: ");

    int num = input.nextInt();

    switch (num) {
        case 0:
            createPlayer(input);
            break;
        case 1:
            OpgaveEt.Start();
            break;
        case 2:
            createCharacter(input);
            break;
        case 3:
            gamingInventory();
            break;
        case 4:
            findEmoji(input);
            break;
        default:
            System.out.println("Forkert nummer – prøv igen (0-4).");
    }
}

public static void createPlayer(Scanner input) {
    System.out.print("Vælg navn på spiller: ");
    input.nextLine();
    String name = input.nextLine();

    System.out.print("Vælg level på spiller: ");
    int level = input.nextInt();
    Player newPlayer = new Player(name, level);
    newPlayer.displayDetails();
    //System.out.println("Player name: " + newPlayer.getName() + " Player level: " + newPlayer.getLevel());
    System.out.print("Opdater level: ");
    int newLevel = input.nextInt();
    newPlayer.setLevel(newLevel);
    newPlayer.displayDetails();
}

public static void createCharacter(Scanner input) {
    System.out.print("Vælg navn på karakter: ");
    input.nextLine(); // rydder newline fra tidligere nextInt()
    String name = input.nextLine();

    System.out.print("Vælg strength: ");
    int strength = input.nextInt();

    System.out.print("Vælg intelligence: ");
    int intelligence = input.nextInt();

    System.out.print("Vælg charisma: ");
    int charisma = input.nextInt();

    DnDCharacter newCharacter = new DnDCharacter(name, strength, intelligence, charisma);
    newCharacter.displayCharacter();

    // Bonus: træn en stat
    System.out.print("Hvilken stat vil du træne? (strength/intelligence/charisma): ");
    input.nextLine(); // rydder newline
    String stat = input.nextLine();
    newCharacter.train(stat);

    System.out.println("Efter træning:");
    newCharacter.displayCharacter();
}

public void gamingInventory(){
    ArrayList<GamingInventory> inv = new ArrayList<GamingInventory>();
    inv.add(new GamingInventory("Potion", "Health", 20));
    inv.add(new GamingInventory("Potion", "Mana", 15));
    inv.add(new GamingInventory("Weapon", "Sword", 12));
    inv.add(new GamingInventory("Weapon", "Axe", 10));
    inv.add(new GamingInventory("Weapon", "Staff", 5));

    for(GamingInventory item : inv){
        item.displayItem();
    }

    inv.get(3).use();
}
public void findEmoji(Scanner input){
    EmojiMachine newMachine = new EmojiMachine();
    for (int i = 0; i < 5; i++) {
        System.out.println(newMachine.getRandomEmoji());
    }

    System.out.print("Vælg story længde: ");
    System.out.println(newMachine.getEmojiStory(input.nextInt()));
}