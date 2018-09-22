package virtualpetshelter;

import java.util.Scanner;
import java.util.Map.Entry;
public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();
        System.out.println("Welcome to you new Virtual Pet Shelter!!! ");
        System.out.println("Enter a name for your first pet!");
        String name = input.nextLine();
        System.out.println("Enter a description of the pet");
        String description = input.nextLine();
        VirtualPet pet1 = new VirtualPet(name, description);
        shelter.addPet(name, pet1);
        System.out.println("Now you have 1 pet in your shelter");
        // Game loop goes until a pet dies, or there are no pets in the shelter
        do {
            System.out.println("What would you like to do now?");
            displayPets(shelter);
            showMenu();
            String playerChoice = input.nextLine();
            menuChoice(shelter, playerChoice);
            shelter.shelterTick();
        } while (shelter.allPetsAlive && !shelter.hasNoPets());
        input.close();
    }
    // menu for actions
    public static void showMenu() {
        System.out.println("1. Feed Pets");
        System.out.println("2. Give pets water");
        System.out.println("3. Pets free play time");
        System.out.println("4. Play with a Pet");
        System.out.println("5. Bedtime");
        System.out.println("6. Admit a Pet");
        System.out.println("7. Adopt Pet");
        System.out.println("8. Quit");
    }
    // displays pets in shelter
    public static void displayPets(VirtualPetShelter thisShelter) {
        System.out.println("******************************************");
        System.out.println("Name   \t| Hunger | Thirst | Happiness | Energy |");
        System.out.println("--------|--------|--------|-----------|--------|");
        for (Entry<String, VirtualPet> eachPet : thisShelter.shelter.entrySet()) {
            VirtualPet loopedPet = eachPet.getValue();
            System.out
                    .println(loopedPet.getName() + "\t|  " + loopedPet.getHunger() + "\t| " + "" + loopedPet.getThirst()
                            + "\t|   " + loopedPet.getHappiness() + "  \t|  " + loopedPet.getEnergy() + "\t|");
        }
        System.out.println("******************************************");
    }
    // performs method
    public static void menuChoice(VirtualPetShelter shelter, String playerChoice) {
        Scanner input = new Scanner(System.in);
        switch (playerChoice) {
        case "1":
            shelter.feedAllPets();
            break;
        case "2":
            shelter.waterAllPets();
            break;
        case "3":
            shelter.allPetsPlay();
            break;
        case "4":
            System.out.println("Which pet would you like to play with?");
            System.out.println("(Caps matters)");
            displayPetsWithDescriptions(shelter);
            String petName = input.nextLine();
            shelter.playWithOnePet(petName);
        case "5":
            shelter.allPetsSleep();
            break;
        case "6":
            System.out.println("Please enter the name of the pet");
            String id = input.nextLine();
            System.out.println("Please enter description");
            String description = input.nextLine();
            VirtualPet petToAdd = new VirtualPet(id, description);
            shelter.addPet(id, petToAdd);
            System.out.println(id + " has been admitted to the shelter");
            break;
        case "7":
            System.out.println("Which pet would you like to adopt?");
            displayPets(shelter);
            String name = input.nextLine();
            shelter.removePet(name);
            System.out.println(name + " has been adopted! :)");
            break;
        default:
            input.close();
            System.exit(0);
        }
    }
    public static void displayPetsWithDescriptions(VirtualPetShelter thisShelter) {
        for (Entry<String, VirtualPet> eachPet : thisShelter.shelter.entrySet()) {
            VirtualPet loopedPet = eachPet.getValue();
            System.out.println(loopedPet.getName() + ": " + loopedPet.description);
        }
    }
}
