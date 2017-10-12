package exercices.classes;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.setWidth(width);
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
    public double getarea() {
    	return this.width;
    }
    public double getPreimeter() {
    	return 2*(length + width);
    }
    
}