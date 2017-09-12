package lektion3classes;

import lektion4.oop.Car;

public class CarGame {

	public static void main(String[] args) {
        Car jonasBil = new Car();
        
        System.out.println(jonasBil.getSpeed());
        
        jonasBil.setSpeed(2000);
        
        System.out.println(jonasBil.getSpeed());
	}

}
