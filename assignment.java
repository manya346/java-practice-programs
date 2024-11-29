abstract class GeometricObject {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;

	public Octagon() {
	}

	/** Construct a Octagon of a specified side */
	public Octagon(double side) {
		this.side = side;
	}

	/** Set a new specified side */
	public void setSide(double side) {
		this.side = side;
	}

	/** Return side */
	public double getSide() {
		return side;
	}

	@Override /* Return the area of this Octagon */
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override /* Return the perimeter of this Octagon */
	public double getPerimeter() {
		return 8 * side;
	}

	@Override /** Implement compareTo method */
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override /** Override the protected clone in method defined
		in the Object class, and strengthen its accessiblity */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override /** Retrun a String description of this Octagon object*/
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter();
	}
}

public class assignment {
	/** Method method */
	public static void main(String[] args) throws CloneNotSupportedException {
		// Create an Octagon object
		Octagon octagon1 = new Octagon(5);

		// Display area and perimeter of object
		System.out.println("\nOctagon:\nArea: " + octagon1.getArea() + 
			"\nPerimeter: " + octagon1.getPerimeter());

		// Create new object using the clone method
		System.out.println("Cloning Octagon...");
		Octagon octagon2 = (Octagon)octagon1.clone();

		// Compare the two object using compareTo method
		int result = (octagon1.compareTo(octagon2));
		if (result == 1)
			System.out.println("Octagon is greather than its clone.");
		else if (result == -1)
			System.out.println("Octagon is less than its clone."); 
		else
			System.out.println("Octagon is equal to its clone.");
	}
}