package herency;

public class Main {

    public static void main(String[] args){

        Worm worm = new Worm(60000, 5, "Gusanito", 15, "Verde");
        Fish fish = new Fish(20_000_000, 5000, "Pescadito", 180, "azul");

        System.out.println("----------Worm-----------");
        worm.reproduce();
        System.out.println("----------Fish-----------");
        fish.reproduce();
        System.out.println("----------Fish-----------");
        fish.sayMyName();
        System.out.println("----------End-----------");

    }

}
