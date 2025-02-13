package com.gcstudios.graficos;

import java.awt.Graphics;

import com.gcstudios.main.Game;
import com.gcstudios.world.Tile;

public class UI {
	public int heartSize = 33;
	private int initialPosition = ((Game.WIDTH * Game.SCALE -200) - 60) - heartSize;
	private int curLife = (int)(Game.player.life/12);
	
	public void render(Graphics g) {
		for(int i = 0; i < heartSize; i++) {
			curLife = 12;
		if((int)curLife <= 2) {
		g.drawImage(Tile.TILE_HEART, (initialPosition + heartSize) , 10, 33, 33, null);
		}else if((int) curLife > 2) {
			g.drawImage(Tile.TILE_HEART, (initialPosition + 66), 10, 33, 33, null);
		}
		if((int) curLife == curLife-1){
			  g.drawImage(Tile.TILE_HALFHEART, 660 , 10 , 33, 33, null);
		  }else if((int) curLife == curLife-2) {
			  g.drawImage(Tile.TILE_UNHEART, 660 , 10 , 33, 33, null);
     	  }
	   }
    }
 }
