public class Cactus extends Plants implements PrintPlantInfo{
    //Ärver Plants klassen

    private int mineralWaterPerDay = 2;

    public Cactus(String name, PlantType type, double height) {
        super(name, type, height);

    }

    @Override
    public void printLiquidInfo(){
        System.out.println("This " + PlantType.CACTUS.type + " needs " +
                mineralWaterPerDay + "cl of " + Liquids.MINERALWATER.liquidType + "/day");

    }
}
