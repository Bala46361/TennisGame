package TennisGame;

public class TennisGame {

	int playerOneScore;
	int playerTwoScore;

	public String getGameScore(Player firstPlayer, Player secondPlayer) {
		playerOneScore = firstPlayer.getGameScore();
		playerTwoScore = secondPlayer.getGameScore();
		if (isLoveAll()) {
			return firstPlayer.getScoreValue() + "-" + "All";
		}
		return firstPlayer.getScoreValue() + "," + secondPlayer.getScoreValue();
	}

	public boolean isLoveAll() {
		if (playerOneScore == playerTwoScore && playerOneScore == 0) {
			return true;
		} else {
			return false;
		}
	}
}
