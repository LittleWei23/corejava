package A11Navigable;

import java.util.TreeMap;

public class Navigable {
	public static void main(String[] args) {
		TreeMap<String, String> m = new TreeMap<>();

		m.put("A", "Hello");
		m.put("b", "Okay");
		m.put("C", "Well");
		m.put("d", "Boo");
		
		System.out.println(m.floorKey("A"));
		System.out.println(m.lowerKey("b"));
		System.out.println(m.ceilingKey("C"));
		System.out.println(m.higherKey("C"));
		System.out.println(m.pollFirstEntry());
		System.out.println(m.descendingMap());
	}
}
