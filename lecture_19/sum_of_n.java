public class sum_of_n  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;

	}
	public static int Sum(int n) {
		if(n==0) {
			return 0;
		}
		int s=Sum(n-1);
		return s+n;
	}


}
