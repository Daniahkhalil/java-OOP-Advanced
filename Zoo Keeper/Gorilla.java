package com.pack.zookeeper;

public class Gorilla extends Mammal {

	public void throwSomething() {
		this.energyLevel-=5;
		System.out.println("gorilla throw something , level :"+this.energyLevel);
	}
	
	public void eatBananas(){
		this.energyLevel+=5;
		System.out.println("gorilla eats banana , level :"+this.energyLevel);
	}

	
	
	public void climb() {
		this.energyLevel-=5;
		System.out.println("gorilla climbs , level :"+this.energyLevel);
	}
}
