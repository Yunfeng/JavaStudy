public class GenericSort {
	public static void main(String[] args) {
		System.out.println("waiting....");

		Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};
		//int[] intArray = {new Integer(1), new Integer(2), new Integer(-1)};

		sort(intArray);
		System.out.println("Sorted Integer objects:");
		printList(intArray);
	}

	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;

		for(int i = 0; i < list.length - 1; i++) {
			currentMin = list[i];
			currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

	public static void printList(Object[] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}
		System.out.println("");
	}
}