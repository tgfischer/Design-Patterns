package memento;

public class CalcOriginator {
	private int firstNumber;
	private int secondNumber;
	
	// Create a memento object used for restoring two numbers
	public CalcMemento backupLastCalculation() {
		return new CalcMemento(firstNumber, secondNumber);
	}
	
	public int getCalculationResult() {
		return firstNumber + secondNumber;
	}
	
	public void restorePreviousCalculation(CalcMemento memento) {
		this.firstNumber = memento.getFirstNumber();
		this.secondNumber = memento.getSecondNumber();
	}
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}
