package virtualpetshelter;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldHaveName () {
		//arrange
		VirtualPet underTest = new VirtualPet("dan");
		
		String petName = underTest.name;
		Assert.assertEquals("dan", petName);
		}
	
	@Test
	public void shouldBeHungry() {
	
	VirtualPet underTest = new VirtualPet("sid");
	
	int petHunger = underTest.hunger;
	Assert.assertEquals(50, petHunger);
	}
	
	@Test
	public void shouldBeAlive( ) {
		VirtualPet underTest = new VirtualPet("");
		
		boolean alive = underTest.alive;
		Assert.assertTrue(alive);
	}
	@Test
	public void shouldFeed() {
		VirtualPet underTest = new VirtualPet("");
		
		underTest.feed("");
		
		Assert.assertEquals(0, underTest.hunger);	
	}
	
	@Test
	public void shouldBeDead ( ) {
		VirtualPet underTest = new VirtualPet("");
		underTest.hunger = 110;
		underTest.tick();
		Assert.assertFalse(underTest.alive);
	}
	}

	
