package TennisGame;

public class TennisGame {

	int playerOneScore;
	int playerTwoScore;

	public String getGameScore(Player firstPlayer, Player secondPlayer) {
		playerOneScore = firstPlayer.getGameScore();
		playerTwoScore = secondPlayer.getGameScore();
		if (playerOneScore >= 4 || playerTwoScore >= 4) {
			if (Math.abs(playerTwoScore - playerOneScore) >= 2) {
				return (firstPlayer.getGameScore() > secondPlayer.getGameScore())
						? firstPlayer.getPlayerName() + " Wins" : secondPlayer.getPlayerName() + " Wins";
			}
		}
		if (addAllToScore()) {
			return firstPlayer.getScoreValue() + "-" + "All";
		}
		return firstPlayer.getScoreValue() + "," + secondPlayer.getScoreValue();
	}

	public boolean addAllToScore() {
		if (playerOneScore == playerTwoScore) {
			return true;
		} else {
			return false;
		}
	}
}
