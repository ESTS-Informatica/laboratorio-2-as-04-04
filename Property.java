public class Property {

    private static int NUMBER_OF_PROPERTIES = 0;
    private final String id;
    private String description;
    private double price;

    public Property(String description, double price) {
        this.id = Integer.toString(++NUMBER_OF_PROPERTIES);
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
