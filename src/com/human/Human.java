package com.human;

public class Human {

	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }
	
	public void displayHumanStats(){
		
		System.out.println("Strength: " + this.strength);
		System.out.println("Stealth: " + this.stealth);
		System.out.println("Intelligence: " + this.intelligence);
		System.out.println("Health: " + this.health);
		
	}
	
	public void attack(Human target) {
		
		target.health -= this.strength;
	
	}
	
}
