package com.samurai;

import com.human.Human;

public class Samurai extends Human{
	public static int numberOfSamurai = 0;
	
    public Samurai(){
        this.health = 200;
        numberOfSamurai++;
    }
	
	public void deathBlow(Human target) {
		
		target.health = 0;
		this.health = this.health/2;
	
	}
	
	public void meditate() {
		
		this.health = this.health + (this.health/2);
	
	}
	
	public void howMany() {
        System.out.println(numberOfSamurai);
    }
	
}
