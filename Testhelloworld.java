import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testhelloworld {
	
	
	@Test
	public void testResult() {
		Helloworld ob = new helloworld();
		String output = ob.Result();
		assertEquals("Hello, World",output);
	}

}
