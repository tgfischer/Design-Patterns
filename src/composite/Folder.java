package composite;

import java.util.ArrayList;

public class Folder implements FileSystem {
	private String _name;
	private ArrayList<FileSystem> children = new ArrayList<FileSystem>();
	
	public Folder(String name) {
		_name = name;
	}
	
	@Override
	public void add(FileSystem obj) {
		children.add(obj);
	}
	
	@Override
	public void ls() {
		System.out.println(_name);
		
		for (int i = 0; i < children.size(); i++) {
			getChild(i).ls();
		}
	}
	
	@Override
	public FileSystem getChild(int i) {
		return children.get(i);
	}
}
