public class print_dec {

	public static void main(String[] args) {
		int n = 5;
		PD(n);

	}

	public static void PD(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);

	}


}
