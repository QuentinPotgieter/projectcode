public class Plant extends Output {
    private String name;
    private int countryId;

    public Plant() {
        this("", 0);
    }

    public Plant(String name, int countryId) {
        setPlant(name, countryId);
    }

    public Plant(int id, int rate, int availability, int shiftDuration, String name, int countryId) {
        super(id, rate, availability, shiftDuration);
        setPlant(name, countryId);
    }

    private void setPlant(String name, int countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    private String getName() {
        return name;
    }

    private int getCountryId() {
        return countryId;
    }

    public boolean canProduce(int planCapacity) {
        return planCapacity <= getOutput();
    }

    @Override
    public String toString() {
        return "Plant Manufacturing Capacity per Day: " + getOutput() + ", (" + getName() + ", " + getCountryId() + ")";
    }
}
