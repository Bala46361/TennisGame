package TennisGame;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	TennisGame tennisGame;

	@Before
	public void configuringObjectCreation() {
		tennisGame = new TennisGame();
	}
	
	@Test
	public void validateObjectInstanceforNotNull() {
		assertNotNull(tennisGame);
	}
	
	@Test
	public void shouldCreateInstanceForTwoPlayers() {
		Player firstPlayer = new Player();
		Player secondPlayer= new Player();
		assertNotNull(firstPlayer);
		assertNotNull(secondPlayer);
	}

}
