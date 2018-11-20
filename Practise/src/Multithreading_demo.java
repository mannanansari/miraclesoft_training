
public class Multithreading_demo extends Thread{
	public void run() {
		try {
			System.out.println("Current thread"+Thread.currentThread().getId()+"is running");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
