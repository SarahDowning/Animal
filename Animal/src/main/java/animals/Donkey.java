package animals;

public class Donkey extends Animal {

	String famousDonkey;
	float donkeyRating;

	// Constructor Method
	public Donkey(String famousDonkey, float donkeyRating, int animalID, String typeOfAnimal, int age, boolean hadVaccinations) {
		super(animalID, typeOfAnimal, age, hadVaccinations);
		this.famousDonkey = famousDonkey;
		this.donkeyRating = donkeyRating;
	}

	// Getters and Setters
	public String getFamousDonkey() {
		return famousDonkey;
	}

	public void setFamousDonkey(String famousDonkey) {
		this.famousDonkey = famousDonkey;
	}

	public float getDonkeyRating() {
		return donkeyRating;
	}

	public void setDonkeyRating(float donkeyRating) {
		this.donkeyRating = donkeyRating;
	}

	// toString method
	@Override
	public String toString() {
		return "Donkey [famousDonkey=" + famousDonkey + ", donkeyRating=" + donkeyRating + "]";
	}

	// Interface methods
	public void wild(boolean freedom) {
		// TODO Auto-generated method stub
		
	}
	public void hoomanHome(boolean cosy) {
		// TODO Auto-generated method stub
		
	}

}
