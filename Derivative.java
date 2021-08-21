public class Derivative extends Vehicle {
    private boolean electricWindows, automaticGearbox, sunRoof, leatherSeats;
    private int modelId, colorId;

    public Derivative() {
        this(0, 0, false, false, false, false);
    };

    public Derivative(int colorId, int modelId, boolean electricWindows, boolean automaticGearbox, boolean sunRoof,
            boolean leatherSeats) {
        setDerivative(colorId, modelId, electricWindows, automaticGearbox, sunRoof, leatherSeats);
    }

    public Derivative(int id, String name, int modelID, int color, boolean electricWindows, boolean automaticGearbox,
            boolean sunRoof, boolean leatherSeats) {
        super(id, name);
        setDerivative(color, modelID, electricWindows, automaticGearbox, sunRoof, leatherSeats);
    }

    private void setDerivative(int colorId, int modelId, boolean electricWindows, boolean automaticGearbox,
            boolean sunRoof, boolean leatherSeats) {
        this.colorId = colorId;
        this.modelId = modelId;
        this.electricWindows = electricWindows;
        this.automaticGearbox = automaticGearbox;
        this.sunRoof = sunRoof;
        this.leatherSeats = leatherSeats;
    }

    private boolean isElectricWindows() {
        return electricWindows;
    }

    private boolean isAutomaticGearbox() {
        return automaticGearbox;
    }

    private boolean isSunRoof() {
        return sunRoof;
    }

    private boolean isLeatherSeats() {
        return leatherSeats;
    }

    private int getColorId() {
        return colorId;
    }

    private int getModelId() {
        return this.modelId;
    };

    @Override
    public String toString() {
        return "Derivative: (" + getId() + ", " + getName() + ", " + isAutomaticGearbox() + ", " + isElectricWindows()
                + ", " + isSunRoof() + ", " + isLeatherSeats() + ", " + getColorId() + ", " + getModelId() + ")";
    }

}
