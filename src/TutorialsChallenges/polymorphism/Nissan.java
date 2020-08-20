package TutorialsChallenges.polymorphism;

class Nissan extends Car {

    public Nissan(int cylender, String name) {
        super(cylender, name);
    }

    @Override
    public void accelerate() {
        System.out.println("4Runner is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("4Runner Braking....");
    }

}

