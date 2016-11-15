package siit.java4.bubblesort;

public class BubbleSort extends Sorter implements SortAlgorithm {

	@Override
	public <T extends Comparable<T>> void sort(T[] values) {
		sort01(values, 0, 1);
	}

	private <T extends Comparable<T>> void sort01(T[] values, int first, int second) {
		boolean isSorted;
		for (int i = 1; i < values.length; i++) {
			isSorted = true;
			for (int j = 0; j < values.length - i; j++) {
				if (values[j + first].compareTo(values[j + second]) > 0) {
					isSorted = false;
					swap(values, j + first, j + second);
				}
			}
			if (isSorted) {
				for (int q = 0; q < values.length; q++) {			
				      System.out.printf("%-2s", values[q]);   
				    }
				break;

			}
		}

	}

}
