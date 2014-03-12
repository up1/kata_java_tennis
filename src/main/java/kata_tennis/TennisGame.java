package kata_tennis;

public class TennisGame {

	int playerAScore = 0;
	int playerBScore = 0;

	String playerA;
	String playerB;

	public TennisGame(String playerA, String playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}

	public String getScore() {
		String score = "";

		if (isWinner()) {
			score = getPlayerWinner() + " win";
		} else if (playerAScore >= 3 && playerAScore == playerBScore) {
			score = "Deuce";
		} else if (playerAScore == playerBScore) {
			score = convertToScore(playerAScore) + " all";
		} else if (playerAScore == 0) {
			score = "Love," + convertToScore(playerBScore);
		} else {
			score = convertToScore(playerAScore) + "," + convertToScore(playerBScore);
		}
		return score;
	}

	private String getPlayerWinner() {
		String name = this.playerB;
		if (playerAScore == 4)
			name = this.playerA;
		return name;
	}

	private boolean isWinner() {
		return (playerAScore == 4 || playerBScore == 4) && Math.abs(playerAScore - playerBScore) > 1;
	}

	private String convertToScore(int score) {
		String result = "";
		if (score == 0)
			result = "Love";
		else if (score == 1)
			result = "Fifteen";
		else if (score == 2)
			result = "Thirty";
		else if (score == 3)
			result = "Forty";
		return result;
	}

	public void playerAWin() {
		playerAScore++;
	}

	public void playerBWin() {
		playerBScore++;
	}

}
