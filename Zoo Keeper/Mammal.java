package com.pack.zookeeper;

public class Mammal {

	protected int energyLevel;
	
	public Mammal(int energyLevel) {
		super();
		this.energyLevel = 10;
	}

	public Mammal() {
		super();
		this.energyLevel = 10;
		
	}
	
	public void displayEnergy() {
		System.out.println("The energylevel of gorilla "+energyLevel);
		
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	
	
}
