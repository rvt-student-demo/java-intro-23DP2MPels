package lv.rvt;

public class Student extends Person {
    private int studyPoints;

    public Student(String name,String adress) {
        super(name, adress);
        this.studyPoints = 0;
        
    }
    public int credits() {
        return this.studyPoints;
    }

    public void study() {
        this.studyPoints++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "  " + "Study credits " + this.studyPoints;
    }

}
