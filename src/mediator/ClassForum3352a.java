package mediator;

import java.util.Hashtable;

public class ClassForum3352a extends ClassForum {
	// The 'ConcreteMediator' class
	private Hashtable<String, Participant> _participants = new Hashtable<String, Participant>();
	
	@Override
	public void register(Participant participant) {
		if (!_participants.containsKey(participant)) {
			_participants.put(participant.getName(), participant);
		}
		
		participant.setForum(this);
	}
	
	@Override
	public void send(String from, String to, String msg) {
		Participant participant = _participants.get(to);
		
		if (participant != null) {
			participant.receive(from, msg);
		}
	}
}
