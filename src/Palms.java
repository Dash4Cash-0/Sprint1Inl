public class Palms extends Plants implements PrintPlantInfo{
    //Ärver Plants klassen

    private double water = 0.5;
    private double waterPerday;

    public Palms(String name, PlantType type, double height) {
        super(name, type, height);
        this.waterPerday = this.water * height;
    }
    //Polymorphism
    @Override
    public void printLiquidInfo(){
        System.out.println("This " + PlantType.PALM.type + " needs "
                + waterPerday + " litre of " +
                Liquids.WATER.liquidType +  "/day");

    }
}
