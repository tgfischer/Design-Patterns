package mediator;

public abstract class ClassForum {
	public abstract void register(Participant participant);
	public abstract void send(String from, String to, String msg);
}
