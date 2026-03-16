public class pattern27 {

	public static void main(String[] args) {
		int n = 5;
		int start = 1;
		int space = n - 1;
		int row = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			int val=1;
			while(j<=start) {
				System.out.print(val+" ");
				if(j<=start/2) {	
				val++;	
				}
				else{
					val--;
				}
				j++;
			}
			System.out.println();
			row++;
			start+=2;
			space--;

			
		}

	}

}
