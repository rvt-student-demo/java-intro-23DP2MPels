package lv.rvt;

public class Person {
    private String name;
    private int age;

    public Person(String initianName) {
        this.age = 0;
        this.name = initianName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

}
