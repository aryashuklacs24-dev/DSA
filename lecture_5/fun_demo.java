public class fun_demo {

	public static void main(String[] args) {
		System.out.println("hello");
		add();
		System.out.println("Bye");

	}
	public static void add() {
		int a = 8;
		int b = 7;
		int c = a + b;
		sub();
		System.out.println(c);
	}
	public static void sub() {
		int a = 8;
		int b = 7;
		int c = a - b;
		System.out.println(c);
	}

}

