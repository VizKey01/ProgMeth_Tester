package logic;

public abstract class Employee {
    protected String name;
    protected int id;
    protected int baseSalary;
    protected int bonus;

    public Employee(String name, int id, int baseSalary) {
        setName(name);
        setId(id);
        setBaseSalary(baseSalary);
        setBonus(0);
    }

    public int computeSalary() {

        return 0;
    }

    public String getDescription(){

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = Math.max(0, baseSalary);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = Math.max(bonus, 0);
    }
}
