package mediator;

public class Students extends Participant {
	public Students(String name) {
		super(name);
	}
	
	@Override
	public void receive(String from, String msg) {
		System.out.println("To Student: " + from + 
				           " to " + this.getName() + 
				           " : " + msg);
	}
}
