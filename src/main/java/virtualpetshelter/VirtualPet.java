package virtualpetshelter;

public class VirtualPet {

	public String name;
	public int hunger ;
	public int thirst;
	public int happiness;
	public int energy;
	public int time;
	public boolean alive;
	public String description;

	public String getName() {
		return name;
	}
	public int getHunger() {
		return hunger;
	}
	public int getThirst() {
		return thirst;
	}
	public int getHappiness() {
		return happiness;
	}
	public int getEnergy() {
		return energy;
	}
	
	public VirtualPet(String name , String description) {
		this.name = name;
		this.hunger = 50;
		this.thirst = 50;
		this.happiness = 50;
		this.energy = 100;
		this.alive = true;
		this.description= description;
	}

	public void feed(String food) {
		if (food.equals("1")) {
			hunger -= 25;
			thirst += 5;
		} else if (food.equals("2")) {
			hunger -= 15;
			thirst -= 15;
		} else if (food.equals("3")) {
			hunger -= 35;
		} else {
			hunger -= 50;
		}
	}

	public void drink(String drink ) {
		switch (drink) {
		case "1":
			thirst -= 25;
			break;
		case "2":
			thirst -= 15;
			hunger -= 5;
			break;
		case "3":
			thirst -= 35;
			break;
		case "4":
			thirst -= 25;
			hunger -= 15;
			break;
		default :
			thirst -= 50;
		}
		
	}

	public void sleep() {
		energy = 100;
	}

	public void play(String game) {
		switch (game) {
		case "1":
			hunger += 25;
			thirst += 15;
			energy -= 30;
			happiness += 30;
			break;
		case "2":
			hunger += 20;
			thirst += 25;
			energy -= 40;
			happiness += 25;
			break;
		case "3":
			hunger += 20;
			thirst += 20;
			energy -= 20;
			happiness += 20;
			break;
		case "4":
			hunger += 10;
			thirst += 10;
			energy -= 10;
			happiness += 10;
			break;
			default:
				happiness +=10;
		}
	}

	public void die() {
		alive = false;
	}

	public void tick() {		
		degrade();
		if ((hunger > 100) || (thirst > 100 || (energy<0))) {
			die();
		}

	}

	private void degrade() {
		hunger += 5;
		thirst += 5;
		happiness --;
		energy -=5;
	}

	
}