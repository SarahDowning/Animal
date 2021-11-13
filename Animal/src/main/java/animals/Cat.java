package animals;

public class Cat extends Animal {

	String famousCat;
	float catRating;

	// Constructor method
	public Cat(String famousCat, float catRating, int animalID, String typeOfAnimal, int age, boolean hadVaccinations) {
		super(animalID, typeOfAnimal, age, hadVaccinations);
		this.famousCat = famousCat;
		this.catRating = catRating;
	}

	// Getters and Setters
	public String getFamousCat() {
		return famousCat;
	}

	public void setFamousCat(String famousCat) {
		this.famousCat = famousCat;
	}

	public float getCatRating() {
		return catRating;
	}

	public void setCatRating(float catRating) {
		this.catRating = catRating;
	}

	// toString Method
	@Override
	public String toString() {
		return "Cat [famousCat=" + famousCat + ", catRating=" + catRating + "]";
	}

	// Added interface method
	public void hoomanHome(boolean cosy) {

	}

	public void wild(boolean freedom) {
		
	}

}
