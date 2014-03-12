package kata_tennis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
	
	TennisGame tennisGame = new TennisGame("Player A", "Player B");
	
	@Test
	public void newGameShouldReturnLoveAll() throws Exception {
		String score = tennisGame.getScore();
		assertEquals("Love all", score);
	}
	
	@Test
	public void playerAWinFirstBall() throws Exception {
		tennisGame.playerAWin();
		String score = tennisGame.getScore();
		assertEquals("Fifteen,Love", score);
	}
	
	@Test
	public void bothPlayerDrawWithFifteenShouldReturnFifteenAll() throws Exception {
		tennisGame.playerAWin();
		tennisGame.playerBWin();
		String score = tennisGame.getScore();
		assertEquals("Fifteen all", score);
	}

}
