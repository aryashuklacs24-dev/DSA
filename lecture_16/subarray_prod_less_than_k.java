public class subarray_prod_less_than_k {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 6 };
		int k = 10;
	}

	public static int Product_Less_Than_K(int[] arr, int k) {
		int si = 0, ei = 0, p = 1, ans = 0;
		while (ei < arr.length) {
			// window grow
			p = p * arr[ei];

			// Maxiumu_Sum
			while (p >= k && si<=ei) {
				p = p / arr[si];
				si++;
			}
			// answer update
			ans = ans + (ei - si + 1);
			ei++;
		}
		return ans;
	}

}
