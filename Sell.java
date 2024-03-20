import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sell {

    private static int NUMBER_OF_SELLS = 0;
    private final String id;
    private User client;
    private User seller;
    private Property property;
    private LocalDate date;

    public Sell(User client, User seller, Property property) {
        this.id = Integer.toString(++NUMBER_OF_SELLS);
        this.client = client;
        this.seller = seller;
        this.property = property;
        this.date = LocalDate.now();
    }

    public String getId() {
        return this.id;
    }

    public User getClient() {
        return this.client;
    }

    public User getSeller() {
        return this.seller;
    }

    public Property getProperty() {
        return this.property;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        if (date != null && date.isBefore(LocalDate.now())) {
            this.date = date;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/YYYY");
        return "Data da venda \t: " + this.date.format(formatter) + "\n"
                + this.property + "\n";
    }
}
