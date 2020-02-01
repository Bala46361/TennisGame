package TennisGame;

import java.util.Arrays;
import java.util.List;

public class Player {

	String playerName;
	int gameScore = 0;
	public static final List<String> scoreValue = Arrays.asList("Love", "Fifteen", "Thirty", "Forty");

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}

	public String getScoreValue() {
		return scoreValue.get(gameScore);
	}
}
