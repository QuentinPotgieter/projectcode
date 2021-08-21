// Transient Class
enum MotorType {
    XS("Xs"), CXCVT("Xs CVT"), CVT("CVT"), XR("XR");

    private String motorType;

    MotorType(String motorType) {
        this.motorType = motorType;
    }

    @Override
    public String toString() {
        return motorType;
    }
}