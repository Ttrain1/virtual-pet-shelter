package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

	public boolean hasNoPets() {
		if (shelter.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void addPet(String id, VirtualPet petToAdd) {
		shelter.put(id, petToAdd);
	}

	public void removePet(String id) {
		shelter.remove(id);

	}

	public void feedAllPets() {
		for (Entry<String, VirtualPet> eachPet : shelter.entrySet()) {
			VirtualPet loopedPet = eachPet.getValue();
			loopedPet.feed("");
		}

	}

	public void waterAllPets() {
		for (Entry<String, VirtualPet> eachPet : shelter.entrySet()) {
			VirtualPet loopedPet = eachPet.getValue();
			loopedPet.drink("");
		}

	}

	public void allPetsPlay() {
		for (Entry<String, VirtualPet> eachPet : shelter.entrySet()) {
			VirtualPet loopedPet = eachPet.getValue();
			loopedPet.play("");
		}
	}

	public void allPetsSleep() {
		for (Entry<String, VirtualPet> eachPet : shelter.entrySet()) {
			VirtualPet loopedPet = eachPet.getValue();
			loopedPet.sleep();

		}
	}

	public VirtualPet getPet(String id) {
		VirtualPet foundPet = shelter.get(id);
		return foundPet;
	}

	public Collection<VirtualPet> showPets() {
		Collection<VirtualPet> petCollection = shelter.values();
		return petCollection;
	}

	public VirtualPet fetchPetFromName(String petsName) {
		
		VirtualPet petYouNeed = shelter.
		return petYouNeed;
	}
	
}
