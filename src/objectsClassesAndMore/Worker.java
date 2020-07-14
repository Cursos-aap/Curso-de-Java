package objectsClassesAndMore;

public abstract class Worker {

    protected int id_worker;
    protected String name;
    protected int age;
    protected String job;
    protected int labor_old;

    public Worker(int id_worker, String name, int age, String job, int labor_old) {
        this.id_worker = id_worker;
        this.name = name;
        this.age = age;
        this.job = job;
        this.labor_old = labor_old;
    }

    protected void introduceTheirSelf(){
        System.out.print("Me llamo " + this.name + ". ");
        System.out.print("Tengo " + age + " años y trabajo desde ");
        System.out.print("hace " + (age - labor_old) + " años ");
        System.out.println("y trabajo como " + this.job);
    }

    protected abstract void work();
    protected abstract void specialize();
}
