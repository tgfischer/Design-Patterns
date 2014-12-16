package observer;

public class HexObserver extends Observer {
	public HexObserver(Subject s) {
		_subject = s;
		_subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.print(" " + Integer.toHexString(_subject.getState()));
	}
}
