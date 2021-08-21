public class Color {
    public int id;
    public String description;

    public Color() {
        this(0, "red");
    }

    public Color(int id, String description) {
        this.setColor(id, description);
    }

    private void setColor(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getID() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "Color: " + getID() + " " + getDescription();
    }
}
