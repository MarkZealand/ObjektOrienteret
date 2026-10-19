import java.util.ArrayList;
//    Hvordan kan vi bruge returnværdier til at gøre programmet mere fleksibelt?
//    - Ved at bruge return værdier i metoderne kan vi definere outputtet i terminal/UI nemmere, og altså kun bruge klassen til data.
public class EmojiMachine {

    private ArrayList<String> emojis = new ArrayList<>();

    public EmojiMachine() {
        emojis.add("😀");
        emojis.add("😂");
        emojis.add("😍");
        emojis.add("🥰");
        emojis.add("😎");
        emojis.add("🤔");
        emojis.add("😴");
        emojis.add("🤯");
        emojis.add("🥳");
        emojis.add("😭");
        emojis.add("😡");
        emojis.add("🤖");
        emojis.add("👻");
        emojis.add("🐶");
        emojis.add("🐱");
        emojis.add("🦊");
        emojis.add("🐼");
        emojis.add("🦁");
        emojis.add("🐸");
        emojis.add("🦄");
        emojis.add("🍕");
        emojis.add("🍔");
        emojis.add("🍣");
        emojis.add("🍩");
        emojis.add("🍎");
        emojis.add("⚽");
        emojis.add("🎸");
        emojis.add("🚀");
        emojis.add("🔥");
        emojis.add("💎");
    }

    public ArrayList<String> getEmojis() {
        return emojis;
    }

    public String getRandomEmoji(){
        return emojis.get((int) (Math.random() * emojis.size()));
    }
    public String getEmojiStory(int antal){
        String story = "";
        for (int i = 0; i < antal; i++) {
            story += getRandomEmoji();
            story += " ";
        }
        return story;
    }
}