package objectsClassesAndMore;

public class Dog {

    private String name;
    private byte age;
    private String race;
    private String owner;
    private byte puppies;

    public Dog(){ }

    public Dog(String name, byte age, String race, String owner, byte puppies) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.owner = owner;
        this.puppies = puppies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public byte getPuppies() {
        return puppies;
    }

    public void setPuppies(byte puppies) {
        this.puppies = puppies;
    }

    public void bark(){
        System.out.println("Woof woof");
    }

    public void drinkWater(){
        System.out.println("glu glu");
    }

    public void sayMyName(){
        System.out.println("My name is " + name);
    }

}
