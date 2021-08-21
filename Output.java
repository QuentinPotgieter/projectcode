public abstract class Output {
    private int id;
    private int rate;
    private int availablilty;
    private int shiftDuration;

    public Output() {
        this(0, 0, 0, 0);
    }

    public Output(int id, int rate, int availablilty, int shiftDuration) {
        setOutput(id, rate, availablilty, shiftDuration);
    }

    private void setOutput(int id, int rate, int availablilty, int shiftDuration) {
        this.id = id;
        this.rate = rate;
        this.availablilty = availablilty;
        setShiftDurationInMinutes(shiftDuration);
    }

    private void setShiftDurationInMinutes(int shiftDuration) {
        this.shiftDuration = shiftDuration * 60;
    }

    public int getId() {
        return id;
    }

    private int getRate() {
        return rate;
    }

    private int getAvailablity() {
        return availablilty;
    }

    private int getShiftDuration() {
        return shiftDuration;
    }

    public int getOutput() {
        return (getRate() * getAvailablity() * getShiftDuration()) / 100;
    }

    public abstract boolean canProduce(int output);

    @Override
    public String toString() {
        return "Output: (" + getId() + ", " + getRate() + ", " + getAvailablity() + ", " + getShiftDuration() + ")";
    }
}
