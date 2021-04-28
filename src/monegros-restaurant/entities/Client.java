package entities;

public class Client extends Person{
    private String clientId;

    public Client() {
        super();
    }

    public Client(String id) {
        super(id);
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
