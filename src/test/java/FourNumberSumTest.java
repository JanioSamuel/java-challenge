import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FourNumberSumTest {

	@Test
	public void test1() {
		int[] arr = new int[] { 7, 6, 4, -1, 1, 2 };
		Integer[] list1 = {7, 6, 4, -1};
		Integer[] list2 = {7, 6, 1, 2};
		List<Integer[]> expected = Arrays.asList(list1, list2);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 16);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test2() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] list1 = {1, 2, 3, 4};
		List<Integer[]> expected = Collections.singletonList(list1);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 10);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test3() {
		int[] arr = new int[] { 5, -5, -2, 2, 3, -3 };
		Integer[] list1 = {5, -5, -2, 2};
		Integer[] list2 = {5, -5, 3, -3};
		Integer[] list3 = {-2, 2, 3, -3};
		List<Integer[]> expected = Arrays.asList(list1, list2, list3);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 0);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test4() {
		int[] arr = new int[] { -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] list1 = {-2, -1, 1, 6};
		Integer[] list2 = {-2, -1, 2, 5};
		Integer[] list3 = {-2, -1, 3, 4};
		Integer[] list4 = {-2, 1, 2, 3};
		List<Integer[]> expected = Arrays.asList(list1, list2, list3, list4);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 4);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test5() {
		int[] arr = new int[] { -1, 22, 18, 4, 7, 11, 2, -5, -3 };
		Integer[] list1 = {-1, 22, 7, 2};
		Integer[] list2 = {-1, 18, 11, 2};
		Integer[] list3 = {22, 4, 7, -3};
		Integer[] list4 = {22, 11, 2, -5};
		Integer[] list5 = {18, 4, 11, -3};
		List<Integer[]> expected = Arrays.asList(list1, list2, list3, list4, list5);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 30);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test6() {
		int[] arr = new int[] { -10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5 };
		Integer[] list1 = {-10, -3, 28, 5};
		Integer[] list2 = {-10, 28, -6, 8};
		Integer[] list3 = {-3, 2, -7, 28};
		Integer[] list4 = {-5, 2, 15, 8};
		Integer[] list5 = {-5, 2, 12, 11};
		Integer[] list6 = {-5, 12, 8, 5};
		Integer[] list7 = {-7, 28, -6, 5};
		List<Integer[]> expected = Arrays.asList(list1, list2, list3, list4, list5, list6, list7);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 20);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test7() {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		Integer[] list1 = {};
		List<Integer[]> expected = Collections.singletonList(list1);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 100);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}

	@Test
	public void test8() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, -5, 6, -6 };
		Integer[] list1 = {1, 3, -5, 6};
		Integer[] list2 = {1, 4, 5, -5};
		Integer[] list3 = {1, 4, 6, -6};
		Integer[] list4 = {2, 3, 5, -5};
		Integer[] list5 = {2, 3, 6, -6};
		Integer[] list6 = {2, 4, 5, -6};
		List<Integer[]> expected = Arrays.asList(list1, list2, list3, list4, list5, list6);
		List<Integer[]> result = FourNumberSum.fourNumberSum(arr, 5);
		Assert.assertTrue(Arrays.deepEquals(expected.toArray(), result.toArray()));
	}
}
