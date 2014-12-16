package composite;

public class File implements FileSystem {
	private String _name;
	
	public File(String name) {
		_name = name;
	}
	
	@Override
	public void ls() {
		System.out.println(_name);
	}
	
	@Override
	public FileSystem getChild(int i) {
		return null;
	}
	
	@Override
	public void add(FileSystem obj) { 
		return; 
	}
}
