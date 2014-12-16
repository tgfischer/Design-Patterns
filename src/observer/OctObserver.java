package observer;

public class OctObserver extends Observer {
	public OctObserver(Subject s) {
		_subject = s;
		_subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.print(" " + Integer.toOctalString(_subject.getState()));
	}
}
