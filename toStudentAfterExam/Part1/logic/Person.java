package Part1.logic;

public class Person {
    private String name;
    private int ID;


    // Constructor
    public Person(String name, int ID) {
        this.name = name;
        setID(ID);
    }

    // Method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = Math.max(ID, 1);
    }

    public int getID() {
        return ID;
    }

}
