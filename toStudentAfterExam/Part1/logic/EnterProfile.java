package Part1.logic;

public class EnterProfile {
    private final Person person;
    private int bodyTemperature;

    // Constructor
    public  EnterProfile(Person person, int bodyTemperature) {
        this.person = person;
        setBodyTemperature(bodyTemperature);
    }

    // Method
    public boolean hasFever() {
        return bodyTemperature >= 37;
    }

    public void setBodyTemperature(int bodyTemperature) {
        if(bodyTemperature < 35){
            this.bodyTemperature = 35;
        } else this.bodyTemperature = Math.min(bodyTemperature, 42);
    }

    public Person getPerson() {
        return person;
    }

    public int getBodyTemperature() {
        return bodyTemperature;
    }
}
