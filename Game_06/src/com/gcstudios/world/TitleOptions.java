package com.gcstudios.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.main.Game;

public class TitleOptions {
	
	public static BufferedImage T_TITLE = Game.menusprites.getSprite(172,32,130,26);
	public static BufferedImage T_PLAY = Game.menusprites.getSprite(7,7,140,20);
	public static BufferedImage T_OPTIONS = Game.menusprites.getSprite(7,41,140,20);
	public static BufferedImage T_CLOSE = Game.menusprites.getSprite(7,75,140,20);
	public static BufferedImage T_GAMEOVER = Game.menusprites.getSprite(184,73,91,19);
	
	private BufferedImage sprite;
	private int x,y;
	public boolean solid = false;
	
	public TitleOptions(int x,int y,BufferedImage options){
		this.x = x;
		this.y = y;
		this.sprite = options;
	}
	
	public void render(Graphics g){
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
	}

}
