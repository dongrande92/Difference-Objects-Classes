// a class is used like a basic template
// this class is for making video game objects
public class VideoGame
{
    // what info the video games will show
    String title;
    String platform;
    int yearReleased;

    // how the game is printed
    public void showGameInfo()
    {
        System.out.println("Game title: " + title);
        System.out.println("Platform: " + platform);
        System.out.println("Year released: " + yearReleased);
    }
}
