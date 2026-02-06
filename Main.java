public class Main

{
    public static void main(String[] args)
    {

        // first video game object creation
        VideoGame game1 = new VideoGame();
        game1.title = "Raiders of Blackveil";
        game1.platform = "PC";
        game1.yearReleased = 2025;

        // second video game object creation
        VideoGame game2 = new VideoGame();
        game2.title = "Minecraft";
        game2.platform = "Playstation";
        game2.yearReleased = 2011;

        // printed info for the first game
        System.out.println("First Game:");
        game1.showGameInfo();

        System.out.println();

        // printed info for the second game
        System.out.println("Second Game:");
        game2.showGameInfo();
    }
}