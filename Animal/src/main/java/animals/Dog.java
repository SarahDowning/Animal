package animals;

public class Dog extends Animal {

	String famousDog;
	float dogRating;

	// Constructor Method
	public Dog(String famousDog, float dogRating, int animalID, String typeOfAnimal, int age, boolean hadVaccinations) {
		super(animalID, typeOfAnimal, age, hadVaccinations);
		this.famousDog = famousDog;
		this.dogRating = dogRating;
	}

	// Getters and Setters
	public String getFamousDog() {
		return famousDog;
	}

	public void setFamousDog(String famousDog) {
		this.famousDog = famousDog;
	}

	public float getDogRating() {
		return dogRating;
	}

	public void setDogRating(float dogRating) {
		this.dogRating = dogRating;
	}
	
	// Added interface method
	public void hoomanHome(boolean cosy) {

	}

	public void wild(boolean freedom) {
		// TODO Auto-generated method stub
		
	}

	// toString method
	@Override
	public String toString() {
		return "Dog [famousDog=" + famousDog + ", dogRating=" + dogRating + "]";
	}

}
