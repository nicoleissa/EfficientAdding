import java.util.PriorityQueue;
import java.util.Scanner;

/** 
* The EfficientAdding class is a program that adds a sequence of numbers.
* 
* This class contains one method and utilizes the PriorityQueue data structure. 
* 
* @author Nicole Issagholian
*
*/

public class EfficientAdding {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		int input = data.nextInt();
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (int i=0; i < input; i++) {
			queue.offer(data.nextInt());
		}
		
		long totalCost = 0;
		
		while(queue.size() > 1) {
			int num1 = queue.poll();
			int num2 = queue.poll();
			int sum = num1 + num2;
			
			totalCost += sum;
			
			queue.offer(sum);
		}
		
		System.out.println(totalCost);
		
		data.close();

	}

}
