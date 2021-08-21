public class Demand {
    private int id, quantity, derivativeId, planId;

    public Demand() {
        this(0, 0, 0, 0);
    }

    public Demand(int id, int quantity, int derivativeId, int planId) {
        setDemand(id, quantity, derivativeId, planId);
    }

    private void setDemand(int id, int quantity, int derivativeId, int planId) {
        this.id = id;
        this.quantity = quantity;
        this.derivativeId = derivativeId;
        this.planId = planId;
    }

    private int getId() {
        return id;
    }

    private int getQuantity() {
        return quantity;
    }

    private int getdDerivativeId() {
        return derivativeId;
    }

    private int getPlanId() {
        return planId;
    }

    public boolean isPlanEqual(int capacity) {
        return quantity == capacity;
    }

    @Override
    public String toString() {
        return "Demand: (" + getId() + ", " + getQuantity() + ", " + getdDerivativeId() + ", " + getPlanId() + ")";
    }
}
