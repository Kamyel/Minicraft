package com.gcstudios.world;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.main.Game;

public class Tile {
	
	public static BufferedImage TILE_AR = Game.spritesheet.getSprite(0,0,16,16);
	public static BufferedImage TILE_TARDE = Game.spritesheet.getSprite(128,0,16,16);
	public static BufferedImage TILE_NOITE = Game.spritesheet.getSprite(112,0,16,16);
	public static BufferedImage TILE_GRAMA = Game.spritesheet.getSprite(16,0,16,16);
	public static BufferedImage TILE_NEVE = Game.spritesheet.getSprite(80,0,16,16);
	public static BufferedImage TILE_AREIA = Game.spritesheet.getSprite(96,0,16,16);
	public static BufferedImage TILE_TERRA = Game.spritesheet.getSprite(64,0,16,16);
	public static BufferedImage TILE_CUBTERRA = Game.spritesheet.getSprite(96,32,16,16);
	public static BufferedImage TILE_PEDRA = Game.spritesheet.getSprite(16,16,16,16);
	public static BufferedImage TILE_CUBPEDREGULHO = Game.spritesheet.getSprite(112,32,16,16);
	public static BufferedImage TILE_PEDREGULHO = Game.spritesheet.getSprite(32,16,16,16);
	public static BufferedImage TILE_PICARETA = Game.spritesheet.getSprite(32,32,16,16);
	public static BufferedImage TILE_CUBTABUA = Game.spritesheet.getSprite(128,32,16,16);
	public static BufferedImage TILE_TABUA = Game.spritesheet.getSprite(80,16,16,16);
	public static BufferedImage TILE_FOLHA = Game.spritesheet.getSprite(64,16,16,16);
	public static BufferedImage TILE_MADEIRA = Game.spritesheet.getSprite(48,16,16,16);
	public static BufferedImage TILE_HEART = Game.spritesheet.getSprite(99,19,11,11);
	public static BufferedImage TILE_HALFHEART = Game.spritesheet.getSprite(115,19,11,11);
	public static BufferedImage TILE_UNHEART = Game.spritesheet.getSprite(131,19,11,11);
	

	private BufferedImage sprite;
	private int x,y;
	public boolean solid = false;
	
	public Tile(int x,int y,BufferedImage sprite){
		this.x = x;
		this.y = y;
		this.sprite = sprite;
	}
	
	public void render(Graphics g){
		g.drawImage(sprite, x - Camera.x, y - Camera.y, null);
	}

}
