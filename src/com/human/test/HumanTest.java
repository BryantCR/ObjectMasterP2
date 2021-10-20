package com.human.test;
import com.human.*;
import com.wizard.*;
import com.ninja.*;
import com.samurai.*;

public class HumanTest {

    public static void main(String[] args) {
    	
        Human Juan = new Human();
        Human Maria = new Human();
        Human Dragon = new Human();
        Wizard Merlin = new Wizard();
        Ninja Naruto = new Ninja();
        Samurai MiyamotoMusashi = new Samurai();
        Samurai Bryan = new Samurai();

        System.out.println("*============ Juan Stats ===============*");
        Juan.displayHumanStats();
        System.out.println("*============ María Stats ===============*");
        Maria.displayHumanStats();
        System.out.println("*=============== Juan Attack Maria 3 times ============*");
        Juan.attack(Maria);
        Juan.attack(Maria);
        Juan.attack(Maria);
        System.out.println("*============ María Stats ===============*");
        Maria.displayHumanStats();
        System.out.println("*============== Merlin Stats =============*");
        Merlin.displayHumanStats();
        System.out.println("*============== Merlin Heals María =============*");
        Merlin.heal(Maria);
        System.out.println("*============ María Stats ===============*");
        Maria.displayHumanStats();
        System.out.println("*============== Merlin Attacks Juan 2 times =============*");
        Merlin.fireball(Juan);
        Merlin.fireball(Juan);
        System.out.println("*============ Juan Stats ===============*");
        Juan.displayHumanStats();
        System.out.println("*============ Naruto Stats ===============*");
        Naruto.displayHumanStats();
        System.out.println("*============ Naruto Steel Merlin health once ===============*");
        Naruto.steel(Merlin);
        System.out.println("*============ Naruto Stats ===============*");
        Naruto.displayHumanStats();
        System.out.println("*============== Merlin Stats =============*");
        Merlin.displayHumanStats();
        System.out.println("*============ Naruto Runs Away ===============*");
        Naruto.runAway();
        System.out.println("*============ Naruto Stats ===============*");
        Naruto.displayHumanStats();
        System.out.println("*============ MiyamotoMusashi Stats ===============*");
        MiyamotoMusashi.displayHumanStats();
        System.out.println("*============ MiyamotoMusashi deathBlow Dragon ===============*");
        MiyamotoMusashi.deathBlow(Dragon);
        System.out.println("*============ MiyamotoMusashi Stats ===============*");
        MiyamotoMusashi.displayHumanStats();
        System.out.println("*============ Dragon Stats ===============*");
        Dragon.displayHumanStats();
        System.out.println("*============ MiyamotoMusashi Meditate ===============*");
        MiyamotoMusashi.meditate();
        System.out.println("*============ MiyamotoMusashi Stats ===============*");
        MiyamotoMusashi.displayHumanStats();
        System.out.println("*============ How many samurais ===============*");
        Bryan.howMany();      
        
    }
	
}
