package lektion5.konstruktorer;

import lektion4.oop.Car;

public class CarGame {

	public static void main(String[] args) {
        Car jonasBil = new Car(null);
        
        System.out.println(jonasBil.getSpeed());
        
        jonasBil.setSpeed(2000);
        
        System.out.println(jonasBil.getSpeed());
	

	    
	    
	}

}
