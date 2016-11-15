package siit.java4.bubblesort;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class SorterAppTest {

	public void main(String[] args) {
		SorterAppTest app = new SorterAppTest();
		app.run();
	}
	@Test

	public void run() {
		// sort(new Integer[] { 1, 2, 3, 4, 5 });
		sort(new Integer[] { 3, 1, 5, 4, 2 });
		// sort(new Integer[] { 5, 4, 3, 2, 1 });

		System.out.println();

		// sort(new String[] { "a", "b", "x", "d", "e" });
		sort(new String[] { "c", "a", "e", "d", "b" });
		// sort(new String[] { "e", "d", "c", "b", "a" });
	}

	
	public <T extends Comparable<T>> void sort(T[] values) {
		SortAlgorithm sorter = new BubbleSort();
		sorter.sort(values);
		boolean actual = false;

		for (int i = 0; i < values.length-1; i++) {
			
			if (values[i+1].compareTo(values[i]) > 0) {
				actual = true;
			}
		}
		boolean expected = true;
		//System.out.println("ordered = " +actual);
		assertEquals(expected, actual);
	}

}
