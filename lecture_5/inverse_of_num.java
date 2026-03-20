import java.util.*;
public class inverse_of_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Inverse(n));
	}

	public static int Inverse(int n) {
		int sum = 0;
		int placed = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + placed * Math.pow(10, rem - 1));
			n = n / 10;
            placed++;
		}
		return sum;
	}

}

