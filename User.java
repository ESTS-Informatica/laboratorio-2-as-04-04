public class User {

    private static int NUMBER_OF_USERS = 0;
    private final String id;
    private String name;
    private String phone;
    private String email;

    public User(String name, String phone, String email) {
        this.id = Integer.toString(++NUMBER_OF_USERS);
        this.name = (name != null) ? name : "";
        this.phone = (phone != null) ? phone : "";
        this.email = (email != null) ? email : "";
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return this.name + "\t(" + this.phone + ")\t" + this.email;
    }

    public void show() {
        System.out.println(this);
    }
}
