package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.Map.Entry;

import org.hamcrest.Matcher;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest = new VirtualPetShelter();
	VirtualPet dummyPet = new VirtualPet("james", "");

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
		underTest.addPet("", dummyPet);
		underTest.removePet("");
		boolean isEmpty = underTest.hasNoPets();
		assertEquals(true, isEmpty);
	}

	@Test
	public void shouldFeedAllPets() {
		underTest.addPet("", dummyPet);
		underTest.feedAllPets();
		int dummysHunger = dummyPet.getHunger();
		assertEquals(0, dummysHunger);

	}

	@Test
	public void shouldWaterAllPets() {
		underTest.addPet("", dummyPet);
		underTest.waterAllPets();
		int dummysThirst = dummyPet.getThirst();
		assertEquals(0, dummysThirst);
	}

	@Test
	public void petsShouldPlay() {
		underTest.addPet("", dummyPet);
		underTest.allPetsPlay();
		int dummyHappiness = dummyPet.getHappiness();
		assertEquals(60, dummyHappiness);
	}

	@Test
	public void petsShouldSleep() {
		underTest.addPet("", dummyPet);
		underTest.allPetsSleep();
		int dummyenergy = dummyPet.energy;
		assertEquals(100, dummyenergy);
	}

	@Test
	public void shouldGetPet() {
		underTest.addPet("123", dummyPet);
		VirtualPet tempPet = underTest.getPet("123");
		assertEquals(dummyPet, tempPet);
	}

	@Test
	public void shouldGetPetFromName() {
		underTest.addPet("", dummyPet);
		VirtualPet tempPet = underTest.fetchPetFromName("dummyPet");
	}

	@Test
	public void shouldPrintPetsInShelter() {
		underTest.addPet("1",dummyPet);
		for (VirtualPet eachPet : underTest.showPets()) {
			String loopedPet = eachPet.getName();			
			assertEquals("james", loopedPet );
		}
	}

}
