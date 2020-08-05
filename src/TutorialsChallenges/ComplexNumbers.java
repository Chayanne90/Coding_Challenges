package TutorialsChallenges;

public class ComplexNumbers {

    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    public void add(double real, double imaginary) {

        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumbers num){
        this.imaginary = this.imaginary + num.imaginary;
        this.real = this.real + num.real;

    }

    public void subtract(double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract(ComplexNumbers num) {

        this.imaginary = this.imaginary - num.imaginary;
        this.real = this.real - num.real;
    }


    public static void main (String [ ]args){
        ComplexNumbers one = new ComplexNumbers(1.0,1.0);
        ComplexNumbers number = new ComplexNumbers(2.5,-1.5);

        one.add(1,1);
        System.out.println("test 1: " + one.getReal());
        System.out.println("test 2: " + one.getImaginary());
        one.subtract(number);
        System.out.println("test 3: " + one.getReal());
        System.out.println("test 4: " + one.getImaginary());
        number.subtract(one);
        System.out.println("test 5: " + number.getReal());
        System.out.println("test 6: " + number.getImaginary());

    }



}
