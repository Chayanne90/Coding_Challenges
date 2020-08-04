package TutorialsChallenges;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        double x1 = 0.0;
        double y1 = 0.0;

        double distance = Math.sqrt((x1 - this.x)*(x1 - this.x) + (y1 - this.y)*(y1 - this.y));
        return distance;
    }

    public double distance(Point point) {

        double distance = Math.sqrt((point.x - this.x)*(point.x - this.x)+(point.y - this.y)*(point.y - this.y));
        return distance;
    }

    public double distance(int x, int y) {

        double x1 = 0.0;
        double y1 = 0.0;

        double distance = Math.sqrt((this.x - x1)*(this.x - x1) + (this.y - y1)*(this.y - y1));
        return distance;
    }


    public static void main(String [ ] args ) {

        Point first = new Point(6,5);
        Point second = new Point(3,1);
        Point point = new Point();
        //System.out.println("test one : " + first.distance());
        //System.out.println("test 2 : " + first.distance(second));
        System.out.println("test 3 : " + first.distance(-1,-1));
        //System.out.println("test 4 : " + point.distance());
    }
}
