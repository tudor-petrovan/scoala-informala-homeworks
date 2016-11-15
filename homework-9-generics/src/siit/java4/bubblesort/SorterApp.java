package siit.java4.bubblesort;

public class SorterApp {

	public static void main(String[] args) {

		SorterApp app = new SorterApp();
		app.run();

	}

	public void run() {

		//sort(new Integer[] { 1, 2, 3, 4, 5 });
		sort(new Integer[] { 3, 1, 5, 4, 2 });
		//sort(new Integer[] { 5, 4, 3, 2, 1 });

		System.out.println();

		//sort(new String[] { "a", "b", "c", "d", "e" });
		sort(new String[] { "c", "a", "e", "d", "b" });
		//sort(new String[] { "e", "d", "c", "b", "a" });

	}

	private <T extends Comparable<T>> void sort(T[] values) {

	    SortAlgorithm sorter = new BubbleSort();
	    sorter.sort(values);
	    //for (int i = 0; i < values.length; i++) {
	    	//	      System.out.printf("%-2s", values[i]);

	  //}
}}
