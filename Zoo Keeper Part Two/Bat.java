package com.zoo.partii;

public class Bat {
	protected int energyLevel;

	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.energyLevel -=50;
		System.out.println("The sound of a bat taking off and decrease its energy by 50 , Energy Level: "+this.energyLevel);
	}

	public void eatHumans() {
		this.energyLevel +=24;
		System.out.println("So- well, never mind, just increase its energy by 25, Energy Level: "+this.energyLevel);
	}
	
	public void attackTown() {
		this.energyLevel -=100;
		System.out.println("the sound of a town on fire and decrease its energy by 100 , Energy Level: "+this.energyLevel);
	}

	
	

}