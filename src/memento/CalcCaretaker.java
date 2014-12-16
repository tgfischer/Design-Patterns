package memento;

import java.util.ArrayList;

public class CalcCaretaker {
	private ArrayList<CalcMemento> savedNumbers = new ArrayList<CalcMemento>();
	
	public void addMemento(CalcMemento m) {
		savedNumbers.add(m);
	}
	
	public CalcMemento getMemento(int index) {
		return savedNumbers.get(index);
	}
}
