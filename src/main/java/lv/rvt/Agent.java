package lv.rvt;

public class Agent {

    public String name;
    public String lastname;

    public Agent(String initialName, String initiallastname) {
        this.name = initialName;
        this.lastname = initiallastname;

    }

    public String toString() {
        return "My name is " + this.name + ", " + this.name + " " + this.lastname;
    }

}

