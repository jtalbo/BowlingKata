package com.jtalbo.tdd.KataBowlingTest;

import org.junit.Test;

import com.jtalbo.tdd.KataBowling.BowlingGame;

public class BowlingGameTest {

	@Test
	public void canRollGame() {
		BowlingGame game = new BowlingGame();
		game.roll(0);
	}

}
