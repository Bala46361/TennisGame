package TennisGame;

public class TennisGame {

	public static final String GAME_WINS = " Wins";
	public static final String GAME_ADV = " Advantage";
	public static final String GAME_DEUCE = "Deuce";
	public static final String GAME_ALL = "All";

	int playerOneScore;
	int playerTwoScore;

	public String getGameResult(Player firstPlayer, Player secondPlayer) {
		playerOneScore = firstPlayer.getGameScore();
		playerTwoScore = secondPlayer.getGameScore();
		if (playerOneScore >= 4 || playerTwoScore >= 4) {
			if (isWinner()) {
				return getTopScorer(firstPlayer, secondPlayer) + GAME_WINS;
			}
		}
		if (isAdvantage()) {
			return getTopScorer(firstPlayer, secondPlayer) + GAME_ADV;
		}

		if (isDeuce()) {
			return GAME_DEUCE;
		}

		if (addAllToScore()) {
			return firstPlayer.getScoreValue() + "-" + GAME_ALL;
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
