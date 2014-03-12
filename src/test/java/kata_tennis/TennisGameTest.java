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
	
	@Test
	public void playerBWinInFirstBall() throws Exception {
		tennisGame.playerBWin();
		String score = tennisGame.getScore();
		assertEquals("Love,Fifteen", score);
	}
	
	@Test
	public void playerBWinInFirstTwoBall() throws Exception {
		tennisGame.playerBWin();
		tennisGame.playerBWin();
		String score = tennisGame.getScore();
		assertEquals("Love,Thirty", score);
	}
	
	@Test
	public void playerAWinInFirstThreeBall() throws Exception {
		tennisGame.playerAWin();
		tennisGame.playerAWin();
		tennisGame.playerAWin();
		String score = tennisGame.getScore();
		assertEquals("Forty,Love", score);
	}
	
	@Test
	public void playerAWinInFirstTwoBallAndPlayerBWinNextBallShouldReturnThirtyFifteen() throws Exception {
		tennisGame.playerAWin();
		tennisGame.playerAWin();
		tennisGame.playerBWin();
		String score = tennisGame.getScore();
		assertEquals("Thirty,Fifteen", score);
	}
	
	@Test
	public void playersAreDeuce() throws Exception {
		tennisGame.playerAWin();
		tennisGame.playerAWin();
		tennisGame.playerAWin();
		tennisGame.playerBWin();
		tennisGame.playerBWin();
		tennisGame.playerBWin();
		String score = tennisGame.getScore();
		assertEquals("Deuce", score);
	}

}
