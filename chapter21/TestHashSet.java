import java.util.*;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();

		set.add("Jiujiang");
		set.add("Beijing");
		set.add("Shanghai");
		set.add("Nanchang");
		set.add("New York");
		set.add("Shanghai");

		System.out.println(set);

		for(String s: set) {
			System.out.print(s.toUpperCase() + " ");
		}
	}
	
}