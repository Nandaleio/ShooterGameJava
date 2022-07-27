package com.nandaleio.pixel.entity.Particles;

import java.util.Random;

import com.nandaleio.pixel.graphics.Sprite;

public class GroundParticle extends Particle{

	public GroundParticle(double x, double y, int life, int color) {
		super(x, y, life);
		Random rand = new Random();
		this.sprite = new Sprite(rand.nextInt(2)+1, rand.nextInt(2)+1, color);
		this.ya = random.nextGaussian() - 1;
	}

}
