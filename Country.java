public class Country {
    private int id;
    private String description;

    public Country() {
        this(0, "");
    }

    public Country(int id, String description) {
        setCountry(id, description);
    }

    private void setCountry(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    private String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Country: (" + getId() + ", " + getDescription() + ")";
    }
}
