package kata_tennis;

public class TennisGame {

	int playerAScore = 0;
	int playerBScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public String getScore() {
		String score = "Love all";
		if (playerAScore == 1) {
			if (playerAScore == playerBScore) {
				score = "Fifteen all";
			} else {
				score = "Fifteen,Love";
			}
		}
		return score;
	}

	public void playerAWin() {
		playerAScore++;
	}

	public void playerBWin() {
		playerBScore++;
	}

}
