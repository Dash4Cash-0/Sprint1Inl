public abstract class Plants implements PrintPlantInfo{

    //Superklass
    private PlantType type;
    private double height;
    private String name;


    public Plants(String name, PlantType type, double height) {
        this.name = name;
        this.type = type;
        this.height = height;
    }
    public PlantType getType() {
        return type;
    }
    public String getName() {
            return name;
    }
}
