package com.gcstudios.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.main.Game;

public class TitleOptions {
	
	public static BufferedImage T_TITLE = Game.menusprites.getSprite(152,9,160,50);
	public static BufferedImage T_PLAY = Game.menusprites.getSprite(7,7,139,19);
	public static BufferedImage T_OPTIONS = Game.menusprites.getSprite(7,41,139,19);
	public static BufferedImage T_CLOSE = Game.menusprites.getSprite(7,75,139,19);
	public static BufferedImage T_RESPAWN = Game.menusprites.getSprite(7,109,139,19);
	public static BufferedImage T_EXITTITLE = Game.menusprites.getSprite(165,109,139,19);
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
