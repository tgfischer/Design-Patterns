package observer;

public abstract class Observer {
	protected Subject _subject;
	public abstract void update();
}
