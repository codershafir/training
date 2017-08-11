import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Test {

	public static void main(String[] args) {
	BufferedImage b = null;
	
	try {
		File f = new File("C:/Users/Mohammed/Desktop/My photos/IMG_0276.JPG");
		ImageIO.write(b, "jpg",new File("C:\\out.jpg"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

}
