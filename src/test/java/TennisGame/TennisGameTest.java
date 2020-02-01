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
		assertEquals("Love-All", tennisGame.getGameScore(firstPlayer, secondPlayer));
	}

	@Test
	public void checkFirstPlayerTakesFirstPoint() {
		firstPlayer.setGameScore(1);
		secondPlayer.setGameScore(0);
		assertEquals("Fifteen,Love", tennisGame.getGameScore(firstPlayer, secondPlayer));
	}

	@Test
	public void checkScenarioForSecondPlayerTakesFirstPointAfterFirstPlayer() {
		firstPlayer.setGameScore(1);
		secondPlayer.setGameScore(1);
		assertEquals("Fifteen-All", tennisGame.getGameScore(firstPlayer, secondPlayer));
	}

}
