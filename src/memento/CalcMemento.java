package memento;

public class CalcMemento {
	private int firstNumber;
	private int secondNumber;
	
	public CalcMemento(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}
	
	public int getSecondNumber() {
		return secondNumber;
	}
}
