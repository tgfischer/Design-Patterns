package mediator;

public class Instructors extends Participant {
	public Instructors(String name) {
		super(name);
	}
	
	@Override
	public void receive(String from, String msg) {
		System.out.println("To Instructor: " + from + 
		          		   " to " + this.getName() + 
		          		   " : " + msg);
	}
}
