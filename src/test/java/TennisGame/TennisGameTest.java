package TennisGame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	TennisGame tennisGame;
	Player firstPlayer;
	Player secondPlayer;

	@Before
	public void configuringObjectCreation() {
		tennisGame = new TennisGame();
		firstPlayer = new Player();
		secondPlayer = new Player();
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
		firstPlayer.setPlayerName("Bala");
		secondPlayer.setPlayerName("Ajith");
		assertEquals("Bala", firstPlayer.getPlayerName());
		assertEquals("Ajith", secondPlayer.getPlayerName());
	}

}
