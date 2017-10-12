package exercices.classes;

public class Main {

	public static void main(String[] args) {
		Rectangle myNewRectangle = new Rectangle(3.4f, 6.7f);
		System.out.println(myNewRectangle.getLength());

		myNewRectangle.setLength(78.45f);
		
		System.out.println(myNewRectangle.getLength());

	}

}
