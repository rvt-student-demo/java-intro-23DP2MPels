package lv.rvt;

public class Person {
    private String name = "Jānis";
    private int age;
    private int weight;
    private int height;

    public Person(String initialName,int initialAge,int initialHeight,int initialWeight) {
        this.age = initialAge;
        this.weight = initialWeight;
        this.height = initialHeight;
        this.name = initialName;
    }

    public Person(String initialName,int initialAge) {
        this.age = initialAge;
        this.name = initialName;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public static double bodyMassIndex(Person person) {
        double heigthPerHundred = person.height / 100.0;
        return person.weight / (heigthPerHundred * heigthPerHundred);
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height;
        
    }

}