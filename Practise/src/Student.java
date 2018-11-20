
public class Student {
	private static int  y=20;
	public static void attendance() {
		System.out.println("Ayman");
		int x=10;
	}
	
	public static void main(String[] args) {
		System.out.println("Mannan");
		//as attendance is static in student we called it directly without
		//creating the object
		Student.attendance();
		System.out.println(y);
	}

}
