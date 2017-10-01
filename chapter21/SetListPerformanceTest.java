import java.util.*;

public class SetListPerformanceTest {
	static final int N = 50000;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(i);
		}
		Collections.shuffle(list);

		Collection<Integer> set1 = new HashSet<>(list);
		System.out.println(getTestTime(set1) + " ms. member test for hashset");
		System.out.println(getRemoveTime(set1) + "ms. remove for hashset");

		Collection<Integer> set2 = new LinkedHashSet<>(list);
		System.out.println(getTestTime(set2) + " ms. member test for linkedHashSet");
		System.out.println(getRemoveTime(set2) + "ms. remove for linkedHashSet");

		Collection<Integer> set3 = new TreeSet<>(list);
		System.out.println(getTestTime(set3) + " ms. member test for TreeSet");
		System.out.println(getRemoveTime(set3) + "ms. remove for TreeSet");

		Collection<Integer> list1 = new ArrayList<>(list);
		System.out.println(getTestTime(list1) + " ms. member test for ArrayList");
		System.out.println(getRemoveTime(list1) + "ms. remove for ArrayList");

		Collection<Integer> list2 = new LinkedList<>(list);
		System.out.println(getTestTime(list2) + " ms. member test for LinkedList");
		System.out.println(getRemoveTime(list2) + "ms. remove for LinkedList");
	}

	public static long getTestTime(Collection<Integer> c) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < N; i++) {
			c.contains((int)(Math.random() * 2 * N));
		}

		return System.currentTimeMillis() - start;
	}

	public static long getRemoveTime(Collection<Integer> c) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < N; i++) {
			c.remove(i);
		}

		return System.currentTimeMillis() - start;
	}
}