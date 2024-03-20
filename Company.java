import java.util.ArrayList;
import java.util.List;

public class Company {

    private ArrayList<User> clients;
    private ArrayList<User> sellers;
    private ArrayList<Property> properties;
    private ArrayList<Sell> sells;

    public Company() {
        clients = new ArrayList<>();
        sellers = new ArrayList<>();
        properties = new ArrayList<>();
        sells = new ArrayList<>();
    }

    public List<User> getClients() {
        return clients;
    }

    public List<User> getSellers() {
        return sellers;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public List<Sell> getSells() {
        return sells;
    }

    public boolean registerClient(User client) {
        return clients.add(client);
    }

    public boolean registerSeller(User seller) {
        return sellers.add(seller);
    }

    public boolean registerProperty(Property property) {
        return properties.add(property);
    }

    public boolean registerSell(Sell sell) {
        return sells.add(sell);
    }

    public boolean createSell(User client, User seller, Property property) {
        return true; // dummy implementation
    }

    public int calculateSellsOfTheYear(int year) {
        return 0; // dummy implementation
    }

    public String findSellerOfTheYear(int year) {
        return null; // dummy implementation
    }
}
