public class CarnivorousPlant extends Plants implements PrintPlantInfo{
    //Ärver Plants klassen

    private double baseProteinIntake = 0.1;
    private double dailyTotalProtein;


    public CarnivorousPlant(PlantType type, double height){
        super(type, height);
        this.dailyTotalProtein = this.baseProteinIntake + (0.2 * height);
    }

    @Override
    public void printLiquidInfo(){
        System.out.println("This " + PlantType.CARNIVOROUS.type
                + " needs " + dailyTotalProtein
                + " litre of " + Liquids.PROTEINDRINK.liquidType + "/day");
    }
}
