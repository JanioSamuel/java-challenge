import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourNumberSum {

	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		// Write your code here.
		List<Integer[]> arrays = new ArrayList<Integer[]>();
		Integer[] quadruplets = new Integer[4];
		for(int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					for (int l = k + 1; l < array.length; l++) {
						if (array[i] + array[j] + array[k] + array[l] == targetSum) {
							quadruplets[0] = array[i];
							quadruplets[1] = array[j];
							quadruplets[2] = array[k];
							quadruplets[3] = array[l];
							arrays.add(quadruplets);
							quadruplets = new Integer[4];
						}
					}
				}
			}
		}
		return arrays.isEmpty() ? Collections.singletonList(new Integer[] {}) : arrays;
	}
}
