package com.jtalbo.tdd.KataBowlingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jtalbo.tdd.KataBowling.BowlingGame;

public class BowlingGameTest {

	@Test
	public void canRollGame() {
		BowlingGame game = new BowlingGame();
		game.roll(0);
	}
	
	@Test
	public void canRollLineToZero() {
		BowlingGame game = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.getScore());

	}

}
