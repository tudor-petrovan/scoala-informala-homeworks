package siit.java4.bubblesort;


public interface SortAlgorithm {

	public <T extends Comparable<T>> void sort(T[] unsorted); 
	
}
