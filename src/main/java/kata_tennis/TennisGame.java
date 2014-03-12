package kata_tennis;

public class TennisGame {

	int playerAScore = 0;
	int playerBScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public String getScore() {
		String score = "";

		if (playerAScore == playerBScore) {
			score = convertToScore(playerAScore) + " all";
		} else if (playerAScore == 0) {
			score = "Love," + convertToScore(playerBScore);
		} else if (playerAScore == 1) {
			score = convertToScore(playerAScore) + ",Love";
		}
		return score;
	}

	private String convertToScore(int score) {
		String result = "";
		if (score == 0)
			result = "Love";
		else if (score == 1)
			result = "Fifteen";
		else if (score == 2)
			result = "Thirty";
		return result;
	}

	public void playerAWin() {
		playerAScore++;
	}

	public void playerBWin() {
		playerBScore++;
	}

}
