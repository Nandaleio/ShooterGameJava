package com.nandaleio.pixel.level.tile;

import com.nandaleio.pixel.graphics.Screen;
import com.nandaleio.pixel.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
