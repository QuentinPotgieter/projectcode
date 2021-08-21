public class Model extends Vehicle {
    private ModelType modelType;
    private int motorId;
    private int year;

    public Model() {
        this(ModelType.HATCH, 0, 2020);
    };

    private Model(ModelType modelType, int motorId, int year) {
        setModel(modelType, motorId, year);
    };

    public Model(ModelType modelType, int motorId, int year, int Id, String Name) {
        super(Id, Name);
        setModel(modelType, motorId, year);
    };

    private void setModel(ModelType modelType, int motorId, int year) {
        this.modelType = modelType;
        this.motorId = motorId;
        this.year = year;
    }

    private ModelType getTypeId() {
        return modelType;
    }

    private int getMotorId() {
        return motorId;
    }

    private int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Year: (" + getTypeId() + ", " + getMotorId() + ", " + getYear() + ")";
    }
}
