package dev.yambay.casting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConditionalExpressionTest {

	@Test
	void testNPE() {
		boolean flag = false;
		Assertions.assertThrows(NullPointerException.class, () -> {
			int someInt = flag ? 42 : flag ? 42 : null;
		});
	}
}
