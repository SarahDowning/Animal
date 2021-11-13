package animals;

import java.util.ArrayList;
import java.util.List;

import habitat.Domestic;
import habitat.Wild;

public class Animal implements Wild, Domestic {

	private List<Animal> animalList = new ArrayList<Animal>();

	public void vetFees(int hours) {
		System.out.println("The cost for today's vet bill will be: £" + hours * 50);
	}

	// Variables
	private int animalID;
	private String typeOfAnimal;
	private int age;
	private boolean hadVaccinations;

	// 2 methods
	public void noise() {
	}

	public void habitat() {
	
	}

	// Constructor method
	public Animal(int animalID, String typeOfAnimal, int age, boolean hadVaccinations) {
		super();
		this.animalID = animalID;
		this.typeOfAnimal = typeOfAnimal;
		this.age = age;
		this.hadVaccinations = hadVaccinations;
	}

	public Animal() {
	
	}

	// Getters and Setters
	public int getAnimalID() {
		return animalID;
	}

	public void setAnimalID(int animalID) {
		this.animalID = animalID;
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHadVaccinations() {
		return hadVaccinations;
	}

	public void setHadVaccinations(boolean hadVaccinations) {
		this.hadVaccinations = hadVaccinations;
	}

	//printing the list of animals
			public void printAnimals() {
				for (Animal animal : this.animalList)
					System.out.println(animal);
			}
			public void addAnimal(Animal animal) {
				animalList.add(animal);
				System.out.println("Added " + animal);
			}

			public void removeAnimal(Animal animal) {
				animalList.remove(animal);
				System.out.println("Removed animal from list: " + animal);
			}
	// toString method

	@Override
	public String toString() {
		return "Animal [animalID=" + animalID + ", typeOfAnimal=" + typeOfAnimal + ", age=" + age + ", hadVaccinations="
				+ hadVaccinations + "]";
	}

	public void hoomanHome(boolean cosy) {
		// TODO Auto-generated method stub
		
	}

	public void wild(boolean freedom) {
		// TODO Auto-generated method stub
		
	}

}
