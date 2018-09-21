package virtualpetshelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VirtualPetShelterAppTest {
	VirtualPetShelterApp underTest = new VirtualPetShelterApp();
		
	@Test
	public void shouldShowMenu() {
		underTest.showMenu();
	}

}
