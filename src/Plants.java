public abstract class Plants {

    //Använder Polymorfism med den här klassen, resten av växterna ärver denna.
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
