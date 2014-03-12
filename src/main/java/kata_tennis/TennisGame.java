package kata_tennis;

public class TennisGame {
	
	int playerAScore = 0;
	int playerBScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public String getScore() {
		if(playerAScore==1) {
			if(playerAScore == playerBScore) {
				return "Fifteen all";
			}
			return "Fifteen,Love";
		}
		return "Love all";
	}

	public void playerAWin() {		
		playerAScore++;
	}

	public void playerBWin() {
		playerBScore++;
	}

}
