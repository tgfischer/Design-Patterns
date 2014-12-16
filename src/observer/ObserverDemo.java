package observer;

import java.util.Scanner;

public class ObserverDemo {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}
	}
}
