package dev.yambay.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import dev.yambay.collections.K;
import dev.yambay.collections.V;

class MapTest {

	@Test
	void test() {
		Map<K, V> map = new HashMap<>();
		K k1 = new K(1);
		K k2 = new K(2);
		V v11 = new V("11");
		V v12 = new V("12");
		V v21 = new V("21");
		V v22 = new V("22");
		map.put(k1, v11);
		map.put(k2, v21);

		assertEquals(2, map.size());

		map.put(k1, v12);
		map.put(new K(2), v22);

		assertEquals(3, map.size());
	}
}
