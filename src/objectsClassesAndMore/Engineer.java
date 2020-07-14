package objectsClassesAndMore;

public class Engineer extends Worker{

    public Engineer(int id_worker, String name, int age, String job, int labor_old) {
        super(id_worker, name, age, job, labor_old);
    }

    @Override
    protected void work() {
        System.out.println("Trabajo diseñando robots");
    }

    @Override
    protected void specialize() {
        System.out.println("Me especializaré en inteligencia artificial");
    }
}
