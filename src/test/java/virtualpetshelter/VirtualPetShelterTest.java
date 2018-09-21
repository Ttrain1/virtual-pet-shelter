package virtualpetshelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest = new VirtualPetShelter();
	VirtualPet dummyPet = new VirtualPet("james");

	@Test
	public void shouldStartEmptyShelter() {
		boolean isEmpty = underTest.hasNoPets();
		assertEquals(true, isEmpty);
	}

	@Test
	public void shouldAddPet() {
		underTest.addPet("", dummyPet);
		boolean isEmpty = underTest.hasNoPets();
		assertEquals(false, isEmpty);
	}

	@Test
	public void shouldRemovePet() {
		underTest.addPet("",dummyPet);
		underTest.removePet("");
		boolean isEmpty = underTest.hasNoPets();
		assertEquals(true, isEmpty);
	}

	@Test
	public void shouldFeedAllPets() {
		underTest.addPet("",dummyPet);
		underTest.feedAllPets();
		int dummysHunger = dummyPet.getHunger();
		assertEquals(0, dummysHunger);

	}
	@Test
	public void shouldWaterAllPets() {
		underTest.addPet("",dummyPet);
		underTest.waterAllPets();
		int dummysThirst = dummyPet.getThirst();
		assertEquals(0, dummysThirst);
	}
	@Test
	public void petsShouldPlay() {
		underTest.addPet("",dummyPet);
		underTest.allPetsPlay();
		int dummyHappiness = dummyPet.getHappiness();
		assertEquals(60, dummyHappiness);
	}
	@Test
	public void petsShouldSleep() {
		underTest.addPet("",dummyPet);
		underTest.allPetsSleep();
		int dummyenergy = dummyPet.energy;
		assertEquals(100, dummyenergy);
	}
}
