public class freq_array {
    
	public static void main(String[] args) {
		String s = "sadfghjhkjlnbvcxzdawqertyuiopghfdsafghnbvcxz";
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch - 'a']++;
		}

	}


}
