public abstract class Plants {

    //Använder Polymorfism med den här klassen, resten av växterna ärver denna.
    private PlantType type;
    private double height;


    public Plants(PlantType type, double height) {
        this.type = type;
        this.height = height;
    }
    public PlantType getType() {
        return type;
    }
    public double getHeight() {
        return height;
    }

}
