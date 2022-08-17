// Complete - Java II - Arrays Server Name Generator
package server_name_generator;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String randomAdj = getRandomIndex(adjectives);
        String randomNoun = getRandomIndex(nouns);
        System.out.println("Here is your server name:\n" + randomAdj + "-" + randomNoun);
    }

    private static final String[] adjectives = {"tiny", "oval", "combative", "hateful", "awful", "safe", "premium", "nondescript", "royal", "delirious"};
    private static final String[] nouns = {"editor", "instance", "security", "goal", "insurance", "perception", "meat", "possession", "championship", "obligation"};

    public static String getRandomIndex(String[] array) {
        int randomIndex = (int) (Math.random() * array.length);
        return array[randomIndex];
    }

}
