import java.util.Random;

public class ServerNameGenerator {
    private final String[] adjectives;
    private final String[] nouns;
    private final Random random;

    public ServerNameGenerator() {
        adjectives = new String[]{"red", "blue", "green", "yellow", "orange", "purple", "black", "white", "gray", "pink"};
        nouns = new String[]{"apple", "banana", "cherry", "grape", "kiwi", "lemon", "orange", "pear", "pineapple", "watermelon"};
        random = new Random();
    }

    public String getRandomElement(String[] array) {
        int index = random.nextInt(array.length);
        return array[index];
    }

    public String generateServerName() {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        return adjective + "-" + noun + "-server";
    }

    public static void main(String[] args) {
        ServerNameGenerator generator = new ServerNameGenerator();
        String serverName = generator.generateServerName();
        System.out.println("Your server name: " + serverName);
    }
}
