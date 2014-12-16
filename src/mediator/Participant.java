package mediator;

public abstract class Participant{
	private ClassForum _forum;
	private String _name;
	
	public Participant(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public void setForum(ClassForum f) {
		_forum = f;
	}
	
	public void send(String to, String msg) {
		_forum.send(_name, to, msg);
	}
	
	public abstract void receive(String from, String msg);
}
