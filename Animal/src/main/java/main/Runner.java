package main;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Donkey;
import animals.Rabbit;

public class Runner {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
	
		Animal dog = new Dog("Marley", 8.5f, 1, "Dog", 6, true);
		Animal cat = new Cat("Puss In Boots", 9, 2, "Cat", 3, true);
		Animal rabbit = new Rabbit("Peter", 10, 3, "Rabbit", 5, false);
		Animal donkey = new Donkey("Eeyore", 10, 4, "Donkey", 9, true);
		
		animal.addAnimal(dog);
		animal.addAnimal(cat);
		animal.addAnimal(rabbit);
		animal.addAnimal(donkey);
		
		//animal.printAnimals();
		
	}

}
