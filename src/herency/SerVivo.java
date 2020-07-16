package herency;

public abstract class SerVivo {

    protected double weight;
    protected double volume;
    protected String name;
    protected int age;
    protected String color;

    public SerVivo(double weight, double volume, String name, int age, String color) {
        this.weight = weight;
        this.volume = volume;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void irritability(){
        System.out.println("Tengo la característica de irritabilidad");
    }

    public void death(){
        System.out.println("R.I.P.");
    }

    public abstract void breath();
    public abstract void feed();
    public abstract void reproduce();




}
