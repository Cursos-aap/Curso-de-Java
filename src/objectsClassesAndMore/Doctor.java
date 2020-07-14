package objectsClassesAndMore;

public class Doctor extends Worker{

    private final static String studies = "oncología";
    private final static String school = "Harvard";

    protected Doctor(int id_worker, String name, int age, String job, int labor_old) {
        super(id_worker, name, age, job, labor_old);
    }

    @Override
    protected void introduceTheirSelf(){
        System.out.print("Me llamo " + this.name + ". ");
        System.out.print("Tengo " + age + " años y trabajo desde");
        System.out.print(". Estudié " + studies + " en " + school);
        System.out.println(" y trabajo como " + this.job);
    }

    @Override
    protected void work() {
        System.out.println("Realizo cirugías y doy consultas");
    }

    @Override
    protected void specialize() {
        System.out.println("Me voy a especialzar en neurocirugía");
    }


}
