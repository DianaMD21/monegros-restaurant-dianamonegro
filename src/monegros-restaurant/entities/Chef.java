package entities;

import java.util.List;

public class Chef extends Employee{
    private int experience;
    private List<Order> ordersToCook;
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
    public List<Order> getOrdersToCook() {
        return ordersToCook;
    }

    public void setOrdersToCook(List<Order> ordersToCook) {
        this.ordersToCook = ordersToCook;
    }
}
