public class Drawable1 {
	public static void main(String[] args) {
		Rectangle2 d = new Rectangle2();
		//Here runtime polymorphism
		d.draw();
		d.printable();
	}
	

}
abstract class Drawing1 {
	abstract void draw();
	void printable() {
		System.out.println("ayman");
	}
}
class Rectangle2 extends Drawing1 {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle2 extends Drawing1 {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

