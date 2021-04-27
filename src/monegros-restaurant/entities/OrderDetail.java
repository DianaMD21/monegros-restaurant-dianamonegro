package entities;

public class OrderDetail {
    private Long id;
    private Order order;
    private MenuItem myMenuItem;
    private Double price;
    private Integer quantity;

    public OrderDetail() {
    }

    public OrderDetail(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public MenuItem getProduct() {
        return myMenuItem;
    }

    public void setProduct(MenuItem product) {
        this.myMenuItem = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
