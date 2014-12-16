package decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		String myImage = "SE3352a.jpg";
		System.out.println("The image " + myImage + " is scanned");
		
		// Client has the responsibility to compose desired configurations
		BackupImages mImages = new Compression(
				                   new Encryption(
				                       new SimpleImage(myImage)
				                   )
				               );
		
		mImages.SaveOnDisk();
	}
}
