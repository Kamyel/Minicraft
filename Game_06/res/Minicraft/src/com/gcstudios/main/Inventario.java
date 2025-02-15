package com.gcstudios.main;

import java.awt.Color;
import java.awt.Graphics;

import com.gcstudios.world.Camera;
import com.gcstudios.world.FloorTile;
import com.gcstudios.world.Tile;
import com.gcstudios.world.WallTile;
import com.gcstudios.world.World;

public class Inventario {
	
	public int selected = 0;
	public boolean isPressed = false;
	public int mx,my;
	public boolean isPlacedItem = false;
	public int inventoryBoxSize = 40;
	
	public String[] items = {"terra","pedregulho","tabua","","","picareta", "", ""};
	
	public int initialPosition = ((Game.WIDTH * Game.SCALE) / 2) - ((items.length*inventoryBoxSize) / 2);
	
	public void tick() {
		
		if(isPressed) {
			isPressed = false;
			if(mx >= initialPosition && mx < initialPosition + (inventoryBoxSize*items.length)) {
				if(my >= Game.HEIGHT*Game.SCALE-inventoryBoxSize - 1 && my < Game.HEIGHT*Game.SCALE-inventoryBoxSize - 1 + inventoryBoxSize) {
					selected = (int)(mx-initialPosition)/inventoryBoxSize;
				}
			}
		}
		
		if(isPlacedItem) {
			isPlacedItem = false;
			mx = (int)mx/3 + Camera.x;
			my = (int)my/3 + Camera.y;
			
			int tilex = mx/16;
			int tiley = my/16;
			
			if(World.tiles[tilex+tiley*World.WIDTH].solid == false) {
				if(items[selected] == "terra") {
				  World.tiles[tilex+tiley*World.WIDTH] = new WallTile(tilex*16,tiley*16,Tile.TILE_TERRA);
				}else if(items[selected] == "pedregulho") {
				  World.tiles[tilex+tiley*World.WIDTH] = new WallTile(tilex*16,tiley*16,Tile.TILE_PEDREGULHO);
				}else if(items[selected] == "tabua") {
				  World.tiles[tilex+tiley*World.WIDTH] = new WallTile(tilex*16,tiley*16,Tile.TILE_TABUA);
			    }else if(items[selected] == "picareta") {
				  World.tiles[tilex+tiley*World.WIDTH] = new FloorTile(tilex*16,tiley*16,Tile.TILE_AR);
				}
				if(World.isFree(Game.player.getX(), Game.player.getY()) == false) {
					  World.tiles[tilex+tiley*World.WIDTH] = new FloorTile(tilex*16,tiley*16,Tile.TILE_AR);
				}
			}
		}
	}
	public void render(Graphics g) {
		for(int i = 0; i < items.length; i++) {
			g.setColor(Color.gray);
			g.fillRect(initialPosition + (i*inventoryBoxSize) + 1, Game.HEIGHT*Game.SCALE-inventoryBoxSize + 1- 4, inventoryBoxSize, inventoryBoxSize);
			g.setColor(Color.darkGray);
			g.drawRect(initialPosition + (i*inventoryBoxSize) + 1, Game.HEIGHT*Game.SCALE-inventoryBoxSize + 1- 4, inventoryBoxSize, inventoryBoxSize);
			if(items[i] == "terra") {
				g.drawImage(Tile.TILE_CUBTERRA, initialPosition + (i*inventoryBoxSize) + 7, Game.HEIGHT*Game.SCALE-inventoryBoxSize + 3, 28, 28, null);
			}else if(items[i] == "pedregulho") {
				g.drawImage(Tile.TILE_CUBPEDREGULHO, initialPosition + (i*inventoryBoxSize) + 7, Game.HEIGHT*Game.SCALE-inventoryBoxSize + 3, 28, 28, null);
			}else if(items[i] == "tabua") {
				g.drawImage(Tile.TILE_CUBTABUA, initialPosition + (i*inventoryBoxSize) + 7, Game.HEIGHT*Game.SCALE-inventoryBoxSize + 3, 28, 28, null);
			}else if(items[i] == "picareta") {
				g.drawImage(Tile.TILE_PICARETA, initialPosition + (i*inventoryBoxSize) , Game.HEIGHT*Game.SCALE-inventoryBoxSize -4 , 44, 44, null);
			}
			if(selected == i) {
				g.setColor(Color.white);
				g.drawRect(initialPosition + (i*inventoryBoxSize), Game.HEIGHT*Game.SCALE-inventoryBoxSize- 4, inventoryBoxSize, inventoryBoxSize);
			}
		}
	}
}
