package com.gcstudios.graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Menusprites {

	private BufferedImage menusprites;
	
	public Menusprites(String path)
	{
		try {
			menusprites = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public BufferedImage getSprite(int x,int y,int width,int height){
		return menusprites.getSubimage(x, y, width, height);
	}
}
