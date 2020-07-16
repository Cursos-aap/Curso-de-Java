package herency;

public class Worm extends SerVivo {

    public Worm(double weight, double volume, String name, int age, String color){
        super(weight, volume, name, age, color);
    }

    @Override
    public void breath(){
        System.out.println("Respiro por la piel");
    }

    @Override
    public void feed(){
        System.out.println("Como bacterias y hongos. ¡Yummi yummi!");
    }

    @Override
    public void reproduce(){
        System.out.println("Me reproduzco de manera asexual");
    }

}
