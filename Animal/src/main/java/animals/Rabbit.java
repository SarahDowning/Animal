package animals;

public class Rabbit extends Animal {

	String famousRabbit;
	float rabbitRating;

	// Constructor Method
	public Rabbit(String famousRabbit, float rabbitRating, int animalID, String typeOfAnimal, int age, boolean hadVaccinations) {
		super(animalID, typeOfAnimal, age, hadVaccinations);
		this.famousRabbit = famousRabbit;
		this.rabbitRating = rabbitRating;
	}

	// Getters and Setters
	public String getFamousRabbit() {
		return famousRabbit;
	}

	public void setFamousRabbit(String famousRabbit) {
		this.famousRabbit = famousRabbit;
	}

	public float getRabbitRating() {
		return rabbitRating;
	}

	public void setRabbitRating(float rabbitRating) {
		this.rabbitRating = rabbitRating;
	}


	// toString method
	@Override
	public String toString() {
		return "Rabbit [famousRabbit=" + famousRabbit + ", rabbitRating=" + rabbitRating + "]";
	}

	// Added interface methods
	public void hoomanHome(boolean cosy) {

	}

	public void wild(boolean freedom) {
		
	}

}
