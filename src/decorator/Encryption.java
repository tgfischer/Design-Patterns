package decorator;

public class Encryption extends DecoratedImage {
	public Encryption(BackupImages CryptoImg) {
		super(CryptoImg);
	}
	
	@Override
	public void SaveOnDisk() {
		EncryptImage();
		super.SaveOnDisk();
	}
	
	private void EncryptImage() {
		System.out.println("The image is encrypted");
	}
}
