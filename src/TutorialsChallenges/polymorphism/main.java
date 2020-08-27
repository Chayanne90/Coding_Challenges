package TutorialsChallenges.polymorphism;


class movie {
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}


class Jaws extends movie{

    public Jaws() {
        super("Jaws");
    }

    public String plot() {

        return "A shark eats lots of people";
    }
}

class IndependenceDay extends movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Alience attempt to take over the planet";
    }
}

class MazeRunner extends movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends movie {

    public StarWars() {
        super("StartWars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends movie {

    public Forgetable() {
        super("Forgatable");
    }

    // no plot in here!
}

public class main {

    public static void main(String[] args) {

        for (int i = 1; i <6; i++) {

            movie movie = RandomMovie();
            System.out.println("Movie: " + i + "-" + movie.getName()+ "\n"+ "Plot: " +movie.plot()+"\n");

        }
    }

    public static movie RandomMovie() {

        int random = (int)(Math.random() * 5) +1;

        System.out.println("Randome number generated was: "+ random);

        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}

