public class ProductionPlan extends Output {
    private int plantId;

    public ProductionPlan() {
        this(0);
    }

    public ProductionPlan(int plantId) {
        setPlantId(plantId);
    }

    public ProductionPlan(int plantId, int id, int rate, int availability, int shiftDuration) {
        super(id, rate, availability, shiftDuration);
        setPlantId(plantId);
    }

    private void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    private int getPlantId() {
        return plantId;
    }

    public boolean canProduce(int plantCapacity) {
        return getOutput() <= plantCapacity;
    }

    @Override
    public String toString() {
        return "Production Plan Output Required: (" + getOutput() + ", " + getPlantId() + ")";
    }
}
