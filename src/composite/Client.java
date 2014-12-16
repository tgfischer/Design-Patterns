package composite;

public class Client {
	public static void main(String[] args) {
		Folder one = new Folder("dir111"),
			   two = new Folder("dir222"),
			   thr = new Folder("dir333");
		
		File a = new File("a"),
			 b = new File("b"),
			 c = new File("c"),
			 d = new File("d"),
			 e = new File("e");
		
		one.add(a);
		one.add(b);
		one.add(two);
		
		two.add(c);
		two.add(d);
		two.add(thr);
		
		thr.add(e);
		
		one.ls();
	}
}
