import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SecondLargest {

	/**
	 * @author Chakradhar Chillumuntala.
	 * @param Collection of Integers.
	 * @return second largest value in the list. Also, it will return
	 *         Integer.MIN_VALUE if the list doesn't contain at least 2
	 *         integers.
	 */
	private int secondLargestValue(Collection<Integer> intergerList) {
		int largestValue = Integer.MIN_VALUE;
		int secondlargestValue = Integer.MIN_VALUE;
		for (int value : intergerList) {
			if (value >= largestValue) {
				secondlargestValue = largestValue;
				largestValue = value;
			} else if (value > secondlargestValue) {
				secondlargestValue = value;
			}
		}
		return secondlargestValue;
	}

	public static void main(String args[]) {
		SecondLargest secLarge = new SecondLargest();
		List<Integer> parameter = new ArrayList<Integer>();
		parameter.add(1);
		parameter.add(893299);
		parameter.add(-832832832);
		System.out.println(secLarge.secondLargestValue(parameter));
	}
}
