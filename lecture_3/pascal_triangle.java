import java.util.*;
public class pascal_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 0;
		while (row < n) {
			// star
			int i = 0;
			int ncr=1;
			while (i < star) {
				System.out.print(ncr+" ");
				ncr=((row-i)*ncr)/(i+1);
				i++;
			}
			// Next Line ki prep
			row++;
			star++;
			System.out.println();
		}
	}

}
