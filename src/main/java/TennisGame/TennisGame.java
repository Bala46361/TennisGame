package TennisGame;

public class TennisGame {

	String playerOnevalue = "Fifteen";
	String playerTwoValue = "Love";

	public String getGameScore(Player firstPlayer, Player secondPlayer) {
		// TODO Auto-generated method stub
		int playerOneScore = firstPlayer.getGameScore();
		int playerTwoScore = secondPlayer.getGameScore();
		if (playerOneScore == 1) {
			playerOnevalue = "Fifteen";
		}
		if (playerOneScore == 0) {
			playerOnevalue = "Love";
		}
		if (playerTwoScore == 0) {
			playerTwoValue = "Love";
		}
		if (playerOnevalue.equals(playerTwoValue) && playerOnevalue.equals("Love")) {
			return playerOnevalue + "-" + "All";
		} else {
			return playerOnevalue + "," + playerTwoValue;
		}
	}

}
