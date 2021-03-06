import java.util.*;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<>();
		c1.add("Shanghai");
		c1.add("Beijing");
		c1.add("Nanchang");
		c1.add("Kunming");

		System.out.println("A list of cities in c1:");
		System.out.println(c1);
		System.out.println("Is Nanchang in c1? " + c1.contains("Nanchang") + ". " + c1.size());

		c1.remove("Kunming");
		System.out.println("Is Nanchang in c1? " + c1.contains("Nanchang") + ". " + c1.size());


		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Shanghai");
		c2.add("Jiujiang");
		c2.add("Guangzhou");
		c2.add("Guiyang");

		System.out.println("A list of cities in c2:");
		System.out.println(c2);

		ArrayList<String> a1 = (ArrayList<String>) c1.clone();
		a1.addAll(c2);
		System.out.println("A list of cities in a1:");
		System.out.println(a1);

		a1 = (ArrayList<String>) c1.clone();
		a1.retainAll(c2);
		System.out.println("A list of cities in a1:");
		System.out.println(a1);

		a1 = (ArrayList<String>) c1.clone();
		a1.removeAll(c2);
		System.out.println("A list of cities in a1:");
		System.out.println(a1);


		Iterator<String> iterator = c1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toUpperCase());
		}

		for (String ele: c1) {
			System.out.println(ele + ".");
		}



		ArrayList<String> list1 = new ArrayList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("red");
		list2.add("yellow");
		list2.add("blue");

		a1 = (ArrayList<String>) list1.clone();
		//a1.addAll(list2);
		// a1.add(list2);
		a1.clear();
		System.out.println(a1);
	}
}