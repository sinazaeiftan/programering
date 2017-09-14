package lektion4.oop;

public class Car {
	private int numberOfDoors = 5;
	private int numberOfwheels = 5;
	private String color = "purple";
	private int antaletrattar = 2;
	private String CarBrand = "volvo";
	private int speed = 0;

	/**
	 * konstruktor för bil setter färgen på bilne vid skapade.
	 */
	public Car(String selectedcolor) {
		color = selectedcolor;
	}
	/**
	 * 
	 * @param newSpeed
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	/**
	 * 
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * setter color
	 * @param newColor
	 */
	public void setColor(String newColor) {
		color = newColor;
	}
	/**
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

}
