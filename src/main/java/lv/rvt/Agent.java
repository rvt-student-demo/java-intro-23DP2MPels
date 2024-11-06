package lv.rvt;

public class Agent {

    public String name;
    public String lastname;

    public Agent(String initialName, String initiallastname) {
        name = initialName;
        lastname = initiallastname;

    }

    public String toString() {
        return "My name is " + name + ", " + name + " " + lastname;
    }

}

