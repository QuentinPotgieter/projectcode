public class Role {
    private int id;
    private String description;

    public Role() {
        this(0, "");
    }

    public Role(int id, String description) {
        setRole(id, description);
    }

    public int getId() {
        return id;
    }

    private void setRole(int id, String description) {
        this.id = id;
        this.description = description;
    }

    private String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Role: (" + getId() + ", " + getDescription() + ")";
    }
}
