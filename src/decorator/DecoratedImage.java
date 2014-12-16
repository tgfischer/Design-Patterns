package decorator;

public abstract class DecoratedImage implements BackupImages {
	private BackupImages component;
	
	public DecoratedImage(BackupImages img) {
		component = img;
	}
	
	@Override
	public void SaveOnDisk() {
		component.SaveOnDisk();
	}
}
