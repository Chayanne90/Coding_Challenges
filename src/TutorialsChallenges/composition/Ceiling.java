package TutorialsChallenges.composition;

public class Ceiling {

    private int height;
    private String wallColor;

    public Ceiling(int height, String wallColor) {
        this.height = height;
        this.wallColor = wallColor;
    }

    public int getHeight() {
        return height;
    }

    public String getWallColor() {
        return wallColor;
    }
}
