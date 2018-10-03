package basicSearching;

/**
 * Introduce linear search and binary search
 * 
 * @author Daniel Longman
 *
 */
public class BasicSearchAlgorithms {
	
	/**
	 * Search for specified key based on the linear search algorithm.
	 * If the key is in the array, the index of the first occurrence is returned.
	 * If the key is not found, the method returns -1.
	 * 
	 * @param array
	 * @return
	 */
	public static int linearSearch(char[] array, char key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
