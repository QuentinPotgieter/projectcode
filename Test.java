public class Test {
    public static void main(String[] args) {
        // Maintain Countries
        Country countryA = new Country(1, "China");
        Country countryB = new Country(0, "Japan");
        Country countryC = new Country(2, "South Africa");

        // Maintain Plants
        Output plantA = new Plant(0, 60, 98, 16, "Corrola Sedan Plant", countryA.getId());
        Output plantB = new Plant(1, 90, 80, 8, "Corrola Hatch Plant", countryB.getId());
        Output plantC = new Plant(2, 80, 95, 12, "Corrola Quest Plant", countryC.getId());

        System.out.println(plantA);
        System.out.println(plantB);
        System.out.println(plantC);

        // Maintain Plans
        Output planA = new ProductionPlan(plantA.getId(), 0, 60, 98, 12);
        System.out.println(
                "Can planA be manufactured by plantA?: " + (planA.canProduce(plantA.getOutput()) ? "Yes" : "No"));
        System.out.println("Can plantA manufacture planA?: " + (plantA.canProduce(planA.getOutput()) ? "Yes" : "No"));
        Output planB = new ProductionPlan(plantB.getId(), 1, 60, 98, 12);
        Output planC = new ProductionPlan(plantC.getId(), 2, 60, 98, 12);

        System.out.println(planA);
        System.out.println(planB);
        System.out.println(planC);

        // Maintain Colors
        Color red = new Color(0, "Red");
        Color green = new Color(1, "Green");
        Color blue = new Color(2, "Blue");

        // Maintain Motors
        Motor motorA = new Motor(1, 1600, MotorType.CXCVT, "1.6");
        Motor motorB = new Motor(2, 1800, MotorType.XS, "1.8");
        Motor motorC = new Motor(2, 2400, MotorType.XR, "2.4");

        // Maintain Models
        Vehicle modelA = new Model(ModelType.SEDAN, motorA.getId(), 2021, 0, "Corrola");
        Vehicle modelB = new Model(ModelType.HATCH, motorB.getId(), 2021, 1, "Corrola");
        Vehicle modelC = new Model(ModelType.QUEST, motorC.getId(), 2021, 2, "Corrola");

        // Economic Derivatives
        Vehicle modelADerivativeA = new Derivative(0, "FullHouse", modelA.getId(), red.getID(), true, true, true, true);
        Vehicle modelADerivativeB = new Derivative(1, "FullHouse", modelA.getId(), red.getID(), true, false, false,
                false);
        Vehicle modelADerivativeC = new Derivative(2, "Entry", modelA.getId(), green.getID(), false, false, false,
                false);

        // Mid Price Derivatives
        Vehicle modelBDerivativeA = new Derivative(3, "Standard", modelB.getId(), green.getID(), false, false, false,
                false);
        Vehicle modelBDerivativeC = new Derivative(4, "Automatic", modelB.getId(), blue.getID(), true, true, false,
                false);

        // Expensive Derivatives
        Vehicle modelCDerivativeA = new Derivative(5, "Sport", modelC.getId(), red.getID(), false, false, true, true);
        Vehicle modelCDerivativeB = new Derivative(6, "FullHouse", modelC.getId(), red.getID(), true, true, true, true);

        // Derivatives
        System.out.println(modelADerivativeA);
        System.out.println(modelADerivativeB);
        System.out.println(modelADerivativeC);
        System.out.println(modelBDerivativeA);
        System.out.println(modelBDerivativeC);
        System.out.println(modelCDerivativeA);
        System.out.println(modelCDerivativeB);

        // New Demand Orders (Sales Requests)
        Demand orderA = new Demand(0, 50000, modelADerivativeA.getId(), planA.getId());
        System.out.println(
                "Is Plan Sufficient for the order?: " + (orderA.isPlanEqual(planA.getOutput()) ? "Yes" : "No"));
        System.out.println(orderA);

        // Maintain Roles
        Role roleA = new Role(0, "Planner");
        System.out.println(roleA);

        // Maintain Users
        User userA = new User(0, "John", "Doe", "xxxx", roleA.getId());
        System.out.println(userA);
    }
}
