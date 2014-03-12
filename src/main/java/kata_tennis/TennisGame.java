package kata_tennis;

public class TennisGame {

	int playerAScore = 0;
	int playerBScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public String getScore() {
		String score = "";
		
		if(playerAScore == playerBScore) {
			if(playerAScore == 0) score = "Love all";
			if(playerAScore == 1) score = "Fifteen all";
		}
		
		else if (playerAScore == 1) {
			if (playerAScore == playerBScore) {
				//score = "Fifteen all";
			} else {
				score = "Fifteen,Love";
			}
		} else if (playerBScore == 1) {
			score = "Love,Fifteen";
		} else if(playerBScore == 2) {
			score = "Love,Thirty";
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
