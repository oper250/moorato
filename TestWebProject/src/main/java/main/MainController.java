package main;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

public class MainController {
	public static void main(String[] args) {
		MainController mc = new MainController();
		// mc.makeThumb();
		mc.test();
	}
	
	public void test() {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("!! : " + arr[i]);
		}
	}
	
	
	
	// 썸네일 만들기
	public void makeThumb() {
		String path = "C:\\Users\\chanh\\Desktop\\sample1.png";
		File file = new File(path);
		
		int index = path.lastIndexOf(".");
		String ext = path.substring(index + 1);
		
		String tPath = file.getParent() + File.separator + "t-" + file.getName();
		File tFile = new File(tPath);
		System.out.println("!! : "+file.getName());
		int ratio = 2;		// 이미지 축소 비율
		
		try {
			BufferedImage oImage = ImageIO.read(file);
			int tWidth = (int) (400);
			int tHeight = (int) (400);
			
			BufferedImage tImage = new BufferedImage(tWidth, tHeight, BufferedImage.TYPE_3BYTE_BGR);
			Graphics2D graphic = tImage.createGraphics();
			graphic.drawImage(oImage, 0, 0, tWidth, tHeight, null);
			graphic.dispose();
			
			ImageIO.write(tImage, ext, tFile);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
