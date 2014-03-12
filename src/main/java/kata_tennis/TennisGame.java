package kata_tennis;

public class TennisGame {
	
	int playerAScore = 0;

	public TennisGame(String playerA, String playerB) {
	}

	public String getScore() {
		if(playerAScore==1) {
			return "Fifteen,Love";
		}
		return "Love all";
	}

	public void playerAWin() {		
		playerAScore++;
	}

}
