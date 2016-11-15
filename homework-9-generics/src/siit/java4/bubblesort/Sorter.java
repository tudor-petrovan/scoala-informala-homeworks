package siit.java4.bubblesort;

public class Sorter {
	protected <T> void swap(T[] values, int first, int second){
		T aux=values[first];
		values[first]=values[second];
		values[second]=aux;
	}
}
