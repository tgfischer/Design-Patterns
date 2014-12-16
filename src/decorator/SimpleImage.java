package decorator;

public class SimpleImage implements BackupImages {
	private String imageName;
	
	public SimpleImage(String name) {
		imageName = name;
	}
	
	@Override
	public void SaveOnDisk() {
		System.out.println("The image " + imageName + " is saved");
	}
}
