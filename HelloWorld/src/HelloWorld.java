public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String s0 = "MeTWeM";
		System.out.println(s0.length());
		for(int i = s0.length() - 1; i >= 0; i--) {
			System.out.print(s0.substring(i, s0.lastIndexOf(7)));
		}
	}
}
