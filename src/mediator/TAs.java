package mediator;

public class TAs extends Participant {
	public TAs(String name) {
		super(name);
	}
	
	@Override
	public void receive(String from, String msg) {
		System.out.println("To TA: " + from + 
		          		   " to " + this.getName() + 
		          		   " : " + msg);
	}
}
