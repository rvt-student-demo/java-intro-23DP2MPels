package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName,int initialAge,int initialWeight,int initialHeight) {
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

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
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

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();
    }

    public String toCsvRow(Person person) {
        
        return this.name + ", " + this.age ;
        
    }

}
