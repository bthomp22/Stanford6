import acm.graphics.GImage;

public class flipHorizontal {
	
	private GImage flip(GImage image) {
		int[][] pixels = image.getPixelArray();
		int height = pixels.length;
		int width = pixels[0].length;
		
		for (int row = 0; row < height; row++) {
			for(int pixel = 0; pixel < width; pixel++) {
				int pixel2 = width - pixel - 1;
				int placeholder = pixels[row][pixel];
				pixels[row][pixel] = pixels[row][pixel2];
				pixels[row][pixel2] = placeholder;
			}
			
		}
		return new GImage(pixels);
		
	}
}
