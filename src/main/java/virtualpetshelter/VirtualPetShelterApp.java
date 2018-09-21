package virtualpetshelter;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		VirtualPetShelter fakeShelter = new VirtualPetShelter();
		VirtualPet pet1	= new VirtualPet("Khoi", "limping Khoi");
		VirtualPet pet2= new VirtualPet("Khoi", "walking Khoi");
		fakeShelter.addPet("123", pet1);
		System.out.println(fakeShelter.showPets());
	}
}
