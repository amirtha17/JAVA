import static org.junit.Assert.*;

import org.junit.Test;

class Testhelloworld extends helloworld {
	
	
	@Test
	public void Test_Result() {
		helloworld ob = new helloworld();
		String output = ob.Result();
		assertEquals("Hello, World",output);
	}

}

