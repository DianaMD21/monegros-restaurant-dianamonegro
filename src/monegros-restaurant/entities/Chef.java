package entities;

public class Chef extends Employee{
    private int experience;
    public Chef() {
        super();

    }

    public Chef(String id) {
        super(id);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
