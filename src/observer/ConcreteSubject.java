package observer;

public class ConcreteSubject extends Subject {
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int in) {
		state = in;
		Notify();
	}
}
