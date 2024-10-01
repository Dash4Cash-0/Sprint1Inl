import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public void seePlantsInStore(List<Plants> allPlants){
        for (Plants plant : allPlants) {
            System.out.println(plant.getName() + " the " + plant.getType().type);
        }
    }

    public Main(){
        Scanner input = new Scanner(System.in);

        Cactus Igge = new Cactus("Igge",PlantType.CACTUS, 0.2);
        Palms Laura = new Palms("Laura",PlantType.PALM, 5);
        CarnivorousPlant Meatloaf = new CarnivorousPlant("Meatloaf",PlantType.CARNIVOROUS, 0.7);
        Palms Olof = new Palms("Olof", PlantType.PALM, 1);

        List<Plants> allPlants = new ArrayList<>();
        allPlants.add(Igge);
        allPlants.add(Laura);
        allPlants.add(Meatloaf);
        allPlants.add(Olof);

        System.out.println("These are the plants in store right now\n");
        for (Plants plant : allPlants) {
            System.out.println(plant.getName() + " the " + plant.getType().type);
        }

        boolean isRunning = true;

        while (isRunning) {

            String userInput;

            System.out.println("\nChoose which plant to water: ");
            String choice = input.nextLine().toLowerCase();


            for (Plants plant : allPlants) {
                if (choice.equals(plant.getName().toLowerCase())) {
                    plant.printLiquidInfo();
                    break;
                }
            }

            System.out.println("\nDo you want to water another plant? y/n");
            System.out.println("(Type \"in store\" to see available plants)");
            userInput = input.nextLine().toLowerCase();

            if (userInput.equals("n")) {
                isRunning = false;
                System.out.println("Exiting program...");
            } else if (userInput.equals("in store")) {
                seePlantsInStore(allPlants);
            }
        }
    }
    public static void main(String[] args) {
        Main sprint1 = new Main();
    }
}