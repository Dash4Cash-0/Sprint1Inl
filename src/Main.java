import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public void seePlantsInStore(List<Plants> allPlants, Art print){
        print.printBorder();
        for (Plants plant : allPlants) {
            System.out.println(plant.getName() + " the " + plant.getType().type);
        }
        print.printBorder();
    }

    public Main(){
        Scanner input = new Scanner(System.in);
        Art print = new Art();

        Cactus Igge = new Cactus("Igge",PlantType.CACTUS, 0.2);
        Palms Laura = new Palms("Laura",PlantType.PALM, 5);
        CarnivorousPlant Meatloaf = new CarnivorousPlant("Meatloaf",PlantType.CARNIVOROUS, 0.7);
        Palms Olof = new Palms("Olof", PlantType.PALM, 1);

        List<Plants> allPlants = new ArrayList<>();
        allPlants.add(Igge);
        allPlants.add(Laura);
        allPlants.add(Meatloaf);
        allPlants.add(Olof);

        print.printLogo();

        System.out.println("These are the plants in store right now\n");
        print.printBorder();
        for (Plants plant : allPlants) {
            System.out.println(plant.getName() + " the " + plant.getType().type);
        }
        print.printBorder();


        boolean isRunning = true;
        while (isRunning) {

            String userInput;
            String plantNotAvailable = "";

            System.out.println("\nChoose which plant to water: ");
            String choice = input.nextLine().toLowerCase();


            for (Plants plant : allPlants) {
                if (!choice.equals(plant.getName().toLowerCase())) {
                    plantNotAvailable = "There is no plant with the name " + "\"" + choice + "\"" + "\n";
                }else{
                    plant.printLiquidInfo();
                    plantNotAvailable = "";
                    break;
                }
            }
            System.out.println(plantNotAvailable);

            System.out.println("Do you want to water another plant? y/n");
            System.out.println("(Type \"in store\" to see available plants)");
            userInput = input.nextLine().toLowerCase();

            if (userInput.equals("n")) {
                isRunning = false;
                System.out.println("Exiting program...");
            } else if (userInput.equals("in store")) {
                seePlantsInStore(allPlants, print);
            }
        }
    }
    public static void main(String[] args) {
        Main sprint1 = new Main();
    }
}