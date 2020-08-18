package TutorialsChallenges.composition;

public class PC {

    private Case myCase;
    private Monitor monitor;
    private motherboard motherboard;

    public PC(Case myCase, Monitor monitor, motherboard motherboard) {

        this.myCase = myCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {

        monitor.drawPixelAlt(1500,50,"Blue");
    }

    public void powerUp() {

        myCase.pressPowerButton();
        drawLogo();
    }

}
