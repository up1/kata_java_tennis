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
		createGame(1, 0);
		String score = tennisGame.getScore();
		assertEquals("Fifteen,Love", score);
	}

	@Test
	public void bothPlayerDrawWithFifteenShouldReturnFifteenAll() throws Exception {
		createGame(1, 1);
		String score = tennisGame.getScore();
		assertEquals("Fifteen all", score);
	}

	@Test
	public void playerBWinInFirstBall() throws Exception {
		createGame(0, 1);
		String score = tennisGame.getScore();
		assertEquals("Love,Fifteen", score);
	}

	@Test
	public void playerBWinInFirstTwoBall() throws Exception {
		createGame(0, 2);
		String score = tennisGame.getScore();
		assertEquals("Love,Thirty", score);
	}

	@Test
	public void playerAWinInFirstThreeBall() throws Exception {
		createGame(3, 0);
		String score = tennisGame.getScore();
		assertEquals("Forty,Love", score);
	}

	@Test
	public void playerAWinInFirstTwoBallAndPlayerBWinNextBallShouldReturnThirtyFifteen() throws Exception {
		createGame(2, 1);
		String score = tennisGame.getScore();
		assertEquals("Thirty,Fifteen", score);
	}

	@Test
	public void playersAreDeuce() throws Exception {
		createGame(3, 3);
		String score = tennisGame.getScore();
		assertEquals("Deuce", score);
	}
	
	@Test
	public void playerAWinGame() throws Exception {
		createGame(4, 0);
		String score = tennisGame.getScore();
		assertEquals("Player A win", score);
	}
	
	@Test
	public void playerBWinGame() throws Exception {
		createGame(1, 4);
		String score = tennisGame.getScore();
		assertEquals("Player B win", score);
	}
	
	@Test
	public void playersAreDeuce4() throws Exception {
		createGame(4, 4);
		String score = tennisGame.getScore();
		assertEquals("Deuce", score);
	}
	
	@Test
	public void playerAHaveAdvantageShouldReturnAdvantagePlayerA() throws Exception {
		createGame(5, 4);
		String score = tennisGame.getScore();
		assertEquals("Advantage Player A", score);
	}
	
	@Test
	public void playerBHaveAdvantageShouldReturnAdvantagePlayerB() throws Exception {
		createGame(4, 5);
		String score = tennisGame.getScore();
		assertEquals("Advantage Player B", score);
	}
	
	@Test
	public void playerAWin() throws Exception {
		createGame(4, 2);
		String score = tennisGame.getScore();
		assertEquals("Player A win", score);
	}
	@Test
	public void playerBWin() throws Exception {
		createGame(2, 4);
		String score = tennisGame.getScore();
		assertEquals("Player B win", score);
	}
	
	@Test
	public void playerAWinAfterAdvantage() throws Exception {
		createGame(8, 6);
		String score = tennisGame.getScore();
		assertEquals("Player A win", score);
	}
	
	@Test
	public void playerBWinAfterAdvantage() throws Exception {
		createGame(6, 8);
		String score = tennisGame.getScore();
		assertEquals("Player B win", score);
	}

	private void createGame(int scoreA, int scoreB) {
		for (int i = 0; i < scoreA; i++) {
			tennisGame.playerAWin();
		}
		for (int i = 0; i < scoreB; i++) {
			tennisGame.playerBWin();
		}
	}

}
