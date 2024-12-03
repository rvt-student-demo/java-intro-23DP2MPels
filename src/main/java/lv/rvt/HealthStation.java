package lv.rvt;

public class HealthStation {

    int weighings = 0;

    public int weigh(Person person) {
        weighings = weighings + 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int newWeight = person.getWeight();
        person.setWeight(newWeight + 1);
    }

    public int weighings() {
        return weighings;
    }
}
