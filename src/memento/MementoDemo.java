package memento;

public class MementoDemo {
	public static void main(String[] args) {
		CalcCaretaker caretaker = new CalcCaretaker();
		CalcOriginator calc = new CalcOriginator();
		
		// Assume user enters two numbers
		calc.setFirstNumber(10);
		calc.setSecondNumber(100);
		System.out.println(calc.getCalculationResult());
		caretaker.addMemento(calc.backupLastCalculation());
		
		calc.setFirstNumber(17);
		calc.setSecondNumber(-290);
		System.out.println(calc.getCalculationResult());
		
		calc.restorePreviousCalculation(caretaker.getMemento(0));
		System.out.println(calc.getCalculationResult());
	}
}
