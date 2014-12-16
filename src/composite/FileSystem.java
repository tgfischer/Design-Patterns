package composite;

public interface FileSystem {
	public void ls();
	public void add(FileSystem obj);
	public FileSystem getChild(int i);
}
