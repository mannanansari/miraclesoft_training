//Implementing Abstraction
public abstract class Shape {
	String color;
	abstract Double area();
	public abstract String toString();
	abstract String getColor();
}

class Circle1 {
	Double radius;
}

class Rectangle1 {
	Double length;
	Double width;
}
