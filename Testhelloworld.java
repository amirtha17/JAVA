
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testhelloworld {
	
	helloworld object = new helloworld();
	@Test
	public void testResult() {
		
		String output = object.Display();
		assertEquals("Hello, World",output);
	}
	public static void main(String args[]) {
		Testhelloworld object1 = new Testhelloworld();
		object1.testResult();
	}

}
