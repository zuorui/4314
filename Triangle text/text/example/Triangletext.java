package example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Triangletext {

	

	private boolean isValid;

	@Test
	public void triangleshouldhavepositiveside() {
		assertTrue(new Triangletext().isValid);
	}
	
	@Test
	public void triangleshouldhaveSTGTOS() {
		assertTrue(new Triangletext().isValid);
	}
		
	@Test
	public void text() {
		fail("Not yet implemented");
	}

}
