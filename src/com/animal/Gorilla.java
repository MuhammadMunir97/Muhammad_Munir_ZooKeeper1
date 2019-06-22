package com.animal;

public class Gorilla extends mammal{
	
	public void throwSomething() {
		System.out.println("Gorilla threw a stone");
		energyLevel -= 5;
	}
	public void eatBananas(){
		System.out.println("The Gorilla is satisfied");
		energyLevel += 10;
	}
	public void climb(){
		System.out.println("The Gorilla has climbed a tree");
		energyLevel -= 10;
	}


}
