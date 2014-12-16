package decorator;

public class Compression extends DecoratedImage {
	public Compression(BackupImages CompImg) {
		super(CompImg);
	}
	
	@Override
	public void SaveOnDisk() {
		CompressImage();
		super.SaveOnDisk();
	}
	
	private void CompressImage() {
		System.out.println("The image is compressed");
	}
}
