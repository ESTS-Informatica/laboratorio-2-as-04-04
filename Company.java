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
    Sell sell = new Sell(client, seller, property);
    return registerSell(sell);
    }

    public int calculateSellsOfTheYear(int year) {
    int count = 0; 
    for (Sell sell : sells) {
        if (sell.getDate().getYear() == year) {
            count++;
        }
    }
    return count;
    }

    public String findSellerOfTheYear(int year) {
        int maxSells = 0;
        String sellerOfTheYear = null;

        for (User seller : sellers) {
            int sellsOfSeller = 0;
            for (Sell sell : sells) {
                if (sell.getSeller().equals(seller) && sell.getDate().getYear() == year) {
                    sellsOfSeller++;
                }
            }
            if (sellsOfSeller > maxSells) {
                maxSells = sellsOfSeller;
                sellerOfTheYear = seller.getName();
            }
        }
        return sellerOfTheYear;
    }
}
