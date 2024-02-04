class Main{
	
	public static void main (String[] arg) {
		
		System.out.println("Program started");
		
		Controller controller = new Controller();
		
		controller.start();
		controller.restart();
		controller.stop();
		
	}
	
}