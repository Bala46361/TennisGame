package TennisGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	TennisGame tennisGame;
	Player firstPlayer;
	Player secondPlayer;

	@Before
	public void basicSetUpForStartingGame() {
		tennisGame = new TennisGame();
		firstPlayer = new Player();
		secondPlayer = new Player();
		firstPlayer.setPlayerName("Bala");
		secondPlayer.setPlayerName("Ajith");
	}

	@Test
	public void validateObjectInstanceforNotNull() {
		assertNotNull(tennisGame);
	}

	@Test
	public void shouldCreateInstanceForTwoPlayers() {
		assertNotNull(firstPlayer);
		assertNotNull(secondPlayer);
	}

	@Test
	public void shouldAllowToSetTwoPlayerNames() {
		assertEquals("Bala", firstPlayer.getPlayerName());
		assertEquals("Ajith", secondPlayer.getPlayerName());
	}

	@Test
	public void shouldAllowToSetScoresForTwoPlayers() {
		firstPlayer.setGameScore(0);
		secondPlayer.setGameScore(0);
		assertEquals(0, firstPlayer.getGameScore());
		assertEquals(0, secondPlayer.getGameScore());
	}

	@Test
	public void gameScoreShouldBeLoveAllWhenGameStarts() {
		firstPlayer.setGameScore(0);
		secondPlayer.setGameScore(0);
		assertEquals("Love-All", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void checkFirstPlayerTakesFirstPoint() {
		firstPlayer.setGameScore(1);
		secondPlayer.setGameScore(0);
		assertEquals("Fifteen,Love", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void checkScenarioForSecondPlayerTakesFirstPointAfterFirstPlayer() {
		firstPlayer.setGameScore(1);
		secondPlayer.setGameScore(1);
		assertEquals("Fifteen-All", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void gameScoreShouldBeThirtyCommaFifteenWhenFirstPlayerTakesAnotherPoint() {
		firstPlayer.setGameScore(2);
		secondPlayer.setGameScore(1);
		assertEquals("Thirty,Fifteen", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void gameScoreShouldBeThirtyAllWhenSecondPlayerAlsoGetsSecondPointAfterFirstPlayer() {
		firstPlayer.setGameScore(2);
		secondPlayer.setGameScore(2);
		assertEquals("Thirty-All", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void playerOneWinsFirstTwoBalls() {
		firstPlayer.setGameScore(2);
		secondPlayer.setGameScore(0);
		assertEquals("Thirty,Love", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void playerOneWinsFirstThreeBalls() {
		firstPlayer.setGameScore(3);
		secondPlayer.setGameScore(0);
		assertEquals("Forty,Love", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void firstPlayerWinsTheGame() {
		firstPlayer.setGameScore(4);
		secondPlayer.setGameScore(0);
		assertEquals("Bala Wins", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void secondPlayerWinsTheGame() {
		firstPlayer.setGameScore(0);
		secondPlayer.setGameScore(4);
		assertEquals("Ajith Wins", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void firstPlayerOnAdvantage() {
		firstPlayer.setGameScore(4);
		secondPlayer.setGameScore(3);
		assertEquals("Bala Advantage", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void secondPlayerOnAdvantage() {
		firstPlayer.setGameScore(3);
		secondPlayer.setGameScore(4);
		assertEquals("Ajith Advantage", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void bothPlayersInDeuce() {
		firstPlayer.setGameScore(3);
		secondPlayer.setGameScore(3);
		assertEquals("Deuce", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}

	@Test
	public void bothPlayersScoresTwoPoints() {
		firstPlayer.setGameScore(2);
		secondPlayer.setGameScore(2);
		assertEquals("Thirty-All", tennisGame.getGameResult(firstPlayer, secondPlayer));
	}
}
