package lv.rvt;

public class Teacher extends Person{
    private int zp;

    public Teacher(String name,String adress,int zepe) {
        super(name, adress);
        this.zp = zepe;
    }
    public String toString() {
        return super.toString() + "\n" + "  " + "salary " + this.zp + " euro/month";
    }

}
