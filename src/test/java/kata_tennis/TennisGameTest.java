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

	private void createGame(int scoreA, int scoreB) {
		for (int i = 0; i < scoreA; i++) {
			tennisGame.playerAWin();
		}
		for (int i = 0; i < scoreB; i++) {
			tennisGame.playerBWin();
		}
	}

}
