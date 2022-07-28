/**
 * See README.md to know the problem statement.
 */
package assignment.q1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import assignment.q1.services.FindDuplicates;
import assignment.q1.services.OrderOfConstruction;

/**
 * @author nishthapradhan
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building:");
		int number_of_floors = sc.nextInt();
		
		
		// Add floors in queue
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < number_of_floors; i++) {
			System.out.println("Enter the floor size given on day "+ (i+1));
			q.add(sc.nextInt());
		}
		int[] floor_sizes = new int[number_of_floors];
		for (int i = 0; i < number_of_floors; i++) {
			floor_sizes[i] = q.remove();
		}
		sc.close();
		
		// Check if there are any duplicate values
		FindDuplicates test = new FindDuplicates();
		boolean check_duplicate = test.findDuplicates(floor_sizes, number_of_floors);
		if(!check_duplicate) {
			
			OrderOfConstruction order = new OrderOfConstruction();
			order.orderOfConstruction(floor_sizes, number_of_floors);
			
		}

	}

}
