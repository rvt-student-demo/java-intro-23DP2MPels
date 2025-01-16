package lv.rvt;

public class Student extends Pe {
    private int study_points = 0;

    public Student(int points,String name,String adress) {
        this.study_points = points;
        Student.Person(name,adress);
    }

    public Student(String name,String adress) {
        this.study_points = 0;
        Student.Person(name,adress);
    }




}
