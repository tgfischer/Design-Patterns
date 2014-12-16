package mediator;

public class Client {
	public static void main(String[] args) {
		ClassForum SE3352a = new ClassForum3352a();
		
		Participant george = new Students("George");
		Participant paul   = new Students("Paul");
		Participant ringo  = new TAs("Ringo");
		Participant ouda   = new Instructors("Ouda");
		
		SE3352a.register(george);
		SE3352a.register(paul);
		SE3352a.register(ringo);
		SE3352a.register(ouda);
		
		george.send("Paul", "Hi Paul");
		paul.send("Ringo", "I need some help with IBM RequisitePro");
		paul.send("Ouda", "Software design patterns are fun!");
	}
}
