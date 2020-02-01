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


}
