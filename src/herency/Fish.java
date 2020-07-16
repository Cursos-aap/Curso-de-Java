package herency;

public class Fish extends SerVivo{

    public Fish(double weight, double volume, String name, int age, String color) {
        super(weight, volume, name, age, color);
    }

    public void sayMyName(){
        System.out.println("Me llamo " + this.name);
    }

    @Override
    public void breath() {
        System.out.println("Respiro por las branquias");
    }

    @Override
    public void feed() {
        System.out.println("Hay peces omnívoros, carnívoros, hervívoros y más");
    }

    @Override
    public void reproduce() {
        System.out.println("Me reproduzco por huevos");
    }
}
