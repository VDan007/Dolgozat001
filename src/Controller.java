public class Controller implements Controllable{
	
	// void start();
    // void stop();
    //void restart();
	
	public Controller() {
		
	}
	
	@Override 
	public void start() {
		System.out.println("Start function initiated");
	}
	
	public void stop() {
		System.out.println("Stop function initiated");
	}
	
	public void restart() {
		System.out.println("Restart function initiated");
	}
	
	
}