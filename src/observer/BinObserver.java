package observer;

public class BinObserver extends Observer {
	public BinObserver(Subject s) {
		_subject = s;
		_subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.print(" " + Integer.toBinaryString(_subject.getState()));
	}
}
