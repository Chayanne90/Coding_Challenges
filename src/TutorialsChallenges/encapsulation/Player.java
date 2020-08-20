package TutorialsChallenges.encapsulation;

public class Player {

    private String name;
    private int points = 100;
    private String weapon;

    /* Constructor */
    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health >0 && health <=100){
            this.points = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.points = this.points - damage;
        if (this.points <=0) {
            System.out.println("Player Knocked Out");
        }
    }

    public int getPoints() {
        return points;
    }
}
