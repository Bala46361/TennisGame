package TennisGame;

public class TennisGame {

	int playerOneScore;
	int playerTwoScore;

	public String getGameScore(Player firstPlayer, Player secondPlayer) {
		playerOneScore = firstPlayer.getGameScore();
		playerTwoScore = secondPlayer.getGameScore();
		if (playerOneScore >= 4 || playerTwoScore >= 4) {
			if (isWinner()) {
				return getTopScorer(firstPlayer, secondPlayer) + " Wins";
			}
		}
		if (isAdvantage()) {
			return getTopScorer(firstPlayer, secondPlayer) + " Advantage";
		}

		if (isDeuce()) {
			return "Deuce";
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

	public boolean isWinner() {
		if (Math.abs(playerTwoScore - playerOneScore) >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAdvantage() {
		if (playerOneScore > playerTwoScore && playerTwoScore >= 3) {
			return true;
		} else if (playerTwoScore > playerOneScore && playerOneScore >= 3) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDeuce() {
		if (playerOneScore >= playerTwoScore && playerTwoScore >= 3) {
			return true;
		}
		return false;
	}

	public String getTopScorer(Player firstPlayer, Player secondPlayer) {
		return playerOneScore > playerTwoScore ? firstPlayer.getPlayerName() : secondPlayer.getPlayerName();
	}

}
