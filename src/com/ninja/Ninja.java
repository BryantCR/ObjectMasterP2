package com.ninja;

import com.human.Human;

public class Ninja extends Human{

    public Ninja(){
        this.stealth = 10;
    }
	
	public void steel(Human target) {
		
		target.health -= this.stealth;
		this.health += this.stealth;
	
	}
	
	public void runAway() {
		
		this.health -= 10;
	
	}
	
}
