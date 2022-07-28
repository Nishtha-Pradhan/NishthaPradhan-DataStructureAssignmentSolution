/**
 * 
 */
package assignment.q1.services;


/**
 * @author nishthapradhan
 *
 */
public class OrderOfConstruction {

	public void orderOfConstruction(int[] floor_values, int size) {

		// Print values by position
		System.out.println("\nThe order of construction is as follows:");
		boolean[] test = new boolean[size + 1];
		int max = size;
		for (int i = 0; i < size; i++) {
			System.out.printf("Day %d:\n", (i + 1));
			test[floor_values[i]] = true;
			if (test[max]) {
				while (test[max]) {
					System.out.print(max + " ");
					max--;
				}
			}
			System.out.println();
		}

	}

}
