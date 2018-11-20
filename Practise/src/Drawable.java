public class Drawable {
	public static void main(String[] args) {
		Drawing d = new Rectangle();
		//Runtime Polymorphism
		d.draw();
	}
	

}
interface Drawing {
	void draw();
}
class Rectangle implements Drawing {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle implements Drawing {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

