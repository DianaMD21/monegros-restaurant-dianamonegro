package entities;

import java.util.List;

public class MenuItem {
    private Long id;
    private List<FinalProduct> finalProduct;
    private Double price;
    private Menu menu;

    public MenuItem() {
    }

    public MenuItem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FinalProduct> getFinalProduct() {
        return finalProduct;
    }

    public void setFinalProduct(List<FinalProduct> finalProduct) {
        this.finalProduct = finalProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
