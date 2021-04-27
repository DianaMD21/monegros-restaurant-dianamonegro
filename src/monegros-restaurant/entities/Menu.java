package entities;

import java.util.List;

public class Menu {
    private Long id;
    private String name;
    private List<MenuItem> myMenuItems;

    public Menu() {

    }

    public Menu(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuItem> getFinalProducts() {
        return myMenuItems;
    }

    public void setFinalProducts(List<MenuItem> menuItems) {
        this.myMenuItems = menuItems;
    }
}
