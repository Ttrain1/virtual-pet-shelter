package virtualpetshelter;

import java.util.Scanner;

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

		System.out.println("now You have 1 pet in your shelter");
		System.out.println("What would you like to do now?");
		showMenu();
		String playerChoice = input.nextLine();
		menuChoice(shelter, playerChoice);

	}

	public static void showMenu() {
		System.out.println("1. Feed Pets");
		System.out.println("2. Give pets water");
		System.out.println("3. Pet free play");
		System.out.println("4. Play with a Pet");
		System.out.println("5. Bedtime");
		System.out.println("6. Admit a Pet");
		System.out.println("7. Adopt Pet");
		System.out.println("8. Quit");
	}

	public static void menuChoice(VirtualPetShelter shelter, String playerChoice) {
		Scanner input = new Scanner(System.in);
		switch (playerChoice){
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
				System.out.println("which pet would you like to play with?");
				String petName = input.nextLine();			
				shelter.playWithOnePet(petName);
			case "5":
				shelter.allPetsSleep();
				break;
			case "6":
				System.out.println("please enter the name of the pet");
				String id = input.nextLine();
				System.out.println("Please enter description");
				String description = input.nextLine();
				VirtualPet petToAdd = new VirtualPet(id, description);
				shelter.addPet(id, petToAdd);
				System.out.println(id + " has been admitted to the shelter");
				break;
			case "7":
				System.out.println("please enter the name of the pet");
				String name = input.nextLine();
				shelter.removePet(name);
				System.out.println(name + " has been adopted! :)");
				break;	
			default:
				System.exit(0);
			
			
			
			
			
			
			
			
			
		}
	}

}
