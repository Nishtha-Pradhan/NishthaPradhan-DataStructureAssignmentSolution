/**
 * 
 */
package assignment.q1.services;

import java.util.ArrayList;

/**
 * @author nishthapradhan
 *
 */


public class FindDuplicates {

	// Function to find the Duplicates,
	public boolean findDuplicates(int arr[], int len)
	{

		// initialize ifPresent as false
		boolean ifPresent = false;

		// ArrayList to store the output
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					if (al.contains(arr[i])) {
						break;
					}

					else {
						al.add(arr[i]);
						ifPresent = true;
					}
				}
			}
		}

		if (ifPresent == true) {
			System.out.println(al + "are duplicates that you have entered."
					+ "\n Duplicate floor sizes are not allowed.");
		}
		return ifPresent;
		
	}
}

