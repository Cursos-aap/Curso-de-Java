package objectsClassesAndMore;

public class Objects {


    int number = 10;

    public static void main(String[] args){

        //Dog dog = new Dog("Firulais", (byte) 2, "Husky", "Pepito", (byte) 0);
        //dog.sayMyName();

        Engineer engineer = new Engineer(1, "Pedro", 52, "diseñador de robots", 21);
        Doctor doctor = new Doctor(1, "María", 45, "Médico de un hospital", 20);

        //doctor.specialize();
        //engineer.specialize();

        engineer.introduceTheirSelf();
        System.out.println("-------------------");
        doctor.introduceTheirSelf();


    }

}


